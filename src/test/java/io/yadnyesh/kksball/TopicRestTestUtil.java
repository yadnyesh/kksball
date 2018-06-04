package io.yadnyesh.kksball;

import io.yadnyesh.kksball.entity.Topic.Topic;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;

public class TopicRestTestUtil {
	
	public void getTopicByIdDemo() {
		HttpHeaders headers = getHeaders();
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/user/topic/{id}";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Topic> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Topic.class, 1);
		Topic topic = responseEntity.getBody();
		System.out.println("Response: "  + topic);
	}
	
	
	public void getAllTopicsDemo() {
		HttpHeaders headers = getHeaders();
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/user/topics";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Topic []> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Topic[].class);
		Topic[] topics = responseEntity.getBody();
		Arrays.stream(topics).forEach(System.out::println);
	}
	
	public void addTopicDemo() {
		HttpHeaders headers = getHeaders();
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/user/topic";
		Topic topic = new Topic();
		topic.setTitle("SpringBoot REST Service with Jacoco");
		topic.setCategory("Spring Boot REST");
		HttpEntity<Topic> requestEntity = new HttpEntity<Topic>(topic, headers);
		URI uri = restTemplate.postForLocation(url, requestEntity);
		System.out.printf(uri.getPath());
		
	}
	
	public void updateTopicDemo(){
		HttpHeaders headers = getHeaders();
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/user/topic";
		Topic topic = new Topic();
		topic.setTopicId(1);
		topic.setTitle("Updated: Java Get upto speed");
		topic.setCategory("Java");
		HttpEntity<Topic> httpEntity = new HttpEntity<Topic>(topic, headers);
		restTemplate.put(url, headers);
	}
	
	private HttpHeaders getHeaders() {
		String credential = "sean:s@123";
		String encodedCredential = new String(Base64.encodeBase64(credential.getBytes()));
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", "Basic " + encodedCredential);
		return headers;
	}
	
	public static void main(String[] args) {
		TopicRestTestUtil topicRestTestUtil = new TopicRestTestUtil();
		topicRestTestUtil.getTopicByIdDemo();
		topicRestTestUtil.getAllTopicsDemo();
		topicRestTestUtil.addTopicDemo();
		topicRestTestUtil.updateTopicDemo();
	}
}
