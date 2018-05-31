package io.yadnyesh.kksball.controller.topic;

import io.yadnyesh.kksball.entity.Topic.Topic;
import io.yadnyesh.kksball.service.Topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/user")
public class TopicController {
	
	@Autowired
	TopicService topicService;
	
	@Autowired
	public TopicController(TopicService topicService) {}
	
	@GetMapping("/topic/{id}")
	public ResponseEntity<Topic> getTopicById(@PathVariable ("id") Integer id) {
		Topic topic = topicService.getTopicById(id);
		return new ResponseEntity<Topic>(topic, HttpStatus.OK);
	}
	
	@GetMapping("/topics")
	public ResponseEntity<List<Topic>> getAllTopics() {
		List<Topic> list = topicService.getAllTopics();
		return new ResponseEntity<List<Topic>>(list, HttpStatus.OK);
	}
	
	@PostMapping("/topic")
	public ResponseEntity<String> addTopic(@RequestBody Topic topic, UriComponentsBuilder builder) {
		boolean flag = topicService.addTopic(topic);
		if (flag == false) {
			return new ResponseEntity<String>("This topic already exists.", HttpStatus.CONFLICT);
		}
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(builder.path("/topic/{id}").buildAndExpand(topic.getTopicId()).toUri());
		return new ResponseEntity<String>(httpHeaders, HttpStatus.CREATED);
	}
	
	@PutMapping("/topic")
	public ResponseEntity<Topic> updateTopic(@RequestBody Topic topic){
		topicService.updateTopic(topic);
		return new ResponseEntity<Topic>(topic, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/topic/{id}")
	public ResponseEntity<Void> deleteTopic(@PathVariable("id") Integer id){
		topicService.deleteTopic(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	
}
