package io.yadnyesh.kksball.controller.topic;

import io.yadnyesh.kksball.service.Topic.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TopicController {
	
	
	public TopicController(TopicService topicService) {
	}
}
