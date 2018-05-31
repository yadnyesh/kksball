package io.yadnyesh.kksball;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class TopicRestTestUtil {
	
		private HttpHeaders getHeaders() {
			String credential = "s@123";
			String encodedCredential = new String(Base64.encodeBase64(credential.getBytes()));
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.add("Authorization", "Basic " + encodedCredential);
			return headers;
		}
		
		
}
