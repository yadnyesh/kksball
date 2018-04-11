package io.yadnyesh.kksball.service;

import io.yadnyesh.kksball.entity.GithubUser;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
public class GithubLookupService {
	private static final Logger logger = LoggerFactory.getLogger(GithubLookupService.class);
	private RestTemplate restTemplate;
	
	public GithubLookupService(RestTemplateBuilder restTemplateBuilder){
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public CompletableFuture<GithubUser> findUser(String gitHubUser) throws InterruptedException {
		logger.info("Looking for user: " + gitHubUser);
		String url = String.format("https://api.github.com/users/%s", gitHubUser);
		GithubUser results = restTemplate.getForObject(url, GithubUser.class);
		Thread.sleep(1000);
		return CompletableFuture.completedFuture(results);
	}
	
}
