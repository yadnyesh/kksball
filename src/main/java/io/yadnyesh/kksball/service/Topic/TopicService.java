package io.yadnyesh.kksball.service.Topic;

import io.yadnyesh.kksball.entity.Topic.Topic;
import io.yadnyesh.kksball.repository.Topic.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;
	
	public Topic getTopicById(int topicId){
		Topic topic = topicRepository.getTopicById(topicId);
		return topic;
	}
	
}
