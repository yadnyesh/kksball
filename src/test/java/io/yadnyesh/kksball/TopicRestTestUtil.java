package io.yadnyesh.kksball;

import io.yadnyesh.kksball.entity.Topic.Topic;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

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
	
	
	public void getAllTopics() {
		HttpHeaders headers = getHeaders();
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/user/topics";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Topic []> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Topic[].class);
		Topic[] topics = responseEntity.getBody();
		Arrays.stream(topics).forEach(System.out::println);
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
		topicRestTestUtil.getAllTopics();
	}
}
