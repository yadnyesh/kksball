package io.yadnyesh.kksball.service.Topic;

import io.yadnyesh.kksball.entity.Topic.Topic;
import io.yadnyesh.kksball.repository.Topic.TopicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {
	
	private Logger LOGGER = LoggerFactory.getLogger(TopicService.class);

	@Autowired
	TopicRepository topicRepository;
	
	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	public Topic getTopicById(int topicId){
		Topic topic = topicRepository.getTopicById(topicId);
		return topic;
	}
	
	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	public List<Topic> getAllTopics() {
		return topicRepository.getAllTopics();
	}
	
	@Secured({"ROLE_ADMIN"})
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
	
	@Secured({"ROLE_ADMIN"})
	public void updateTopic(Topic topic) {
		topicRepository.updateTopic(topic);
	}
	
	@Secured({"ROLE_ADMIN"})
	public void deleteTopic(int topicId){
		topicRepository.deleteTopic(topicId);
	}
}
