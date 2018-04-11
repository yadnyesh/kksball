package io.yadnyesh.kksball.service;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.springframework.web.client.RestTemplate;

@Service
public class GithubLookupService {
	private static final Logger logger = LoggerFactory.getLogger(GithubLookupService.class);
	private RestTemplate restTemplate;
	
	public GithubLookupService(RestTemplate restTemplate){
		this.restTemplate = restTemplate;
	}
	
	
}
