package io.yadnyesh.kksball.service.Topic;

import io.yadnyesh.kksball.entity.Topic.Topic;
import io.yadnyesh.kksball.repository.Topic.TopicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {
	
	private Logger LOGGER = LoggerFactory.getLogger(TopicService.class);

	@Autowired
	TopicRepository topicRepository;
	
	public Topic getTopicById(int topicId){
		Topic topic = topicRepository.getTopicById(topicId);
		return topic;
	}
	
	public List<Topic> getAllTopics() {
		return topicRepository.getAllTopics();
	}
	
	public boolean addTopic(Topic topic) {
		if(topicRepository.topicExists(topic.getTitle(), topic.getCategory())) {
			LOGGER.error("Topic {0} already exists.", topic.getTitle());
			return false;
		} else {
			topicRepository.addTopic(topic);
			LOGGER.error("Topic {0} already exists.", topic.getTitle());
			return true;
		}
	}
	
	public void updateTopic(Topic topic) {
		topicRepository.updateTopic(topic);
	}
	
	public void deleteTopic(int topicId){
		topicRepository.deleteTopic(topicId);
	}
}
