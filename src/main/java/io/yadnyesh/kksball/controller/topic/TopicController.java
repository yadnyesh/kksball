package io.yadnyesh.kksball.controller.topic;

import io.yadnyesh.kksball.entity.Topic.Topic;
import io.yadnyesh.kksball.service.Topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TopicController {
	
	@Autowired
	public TopicController(TopicService topicService) {}
	
	public ResponseEntity<Topic>
}
