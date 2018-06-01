package io.yadnyesh.kksball;

import io.yadnyesh.kksball.entity.Topic.Topic;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

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
	
	
	private HttpHeaders getHeaders() {
		String credential = "sean:s@123";
		String encodedCredential = new String(Base64.encodeBase64(credential.getBytes()));
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", "Basic " + encodedCredential);
		return headers;
	}
}
