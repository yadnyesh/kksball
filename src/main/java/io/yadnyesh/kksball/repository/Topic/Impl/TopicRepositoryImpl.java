package io.yadnyesh.kksball.repository.Topic.Impl;

import io.yadnyesh.kksball.entity.Topic.Topic;
import io.yadnyesh.kksball.repository.Topic.TopicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TopicRepositoryImpl implements TopicRepository {
	
	Logger LOGGER = LoggerFactory.getLogger(TopicRepositoryImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Topic> getAllTopics() {
		String hql = "FROM Topic as t ORDER BY t.topicId";
		return (List<Topic>) entityManager.createQuery(hql).getResultList();
	}
	
	@Override
	public Topic getTopicById(int topicId) {
		return entityManager.find(Topic.class, topicId);
	}
	
	@Override
	public void addTopic(Topic topic) {
		entityManager.persist(topic);
	}
	
	@Override
	public void updateTopic(Topic topic) {
		Topic existingTopic = getTopicById(topic.getTopicId());
		if(existingTopic != null){
			existingTopic.setTitle(topic.getTitle());
			existingTopic.setCategory(topic.getCategory());
			entityManager.flush();
		} else {
			LOGGER.error("Topic with title {0}, does not exist. ", topic.getTitle());
		}
	}
	
	@Override
	public void deleteTopic(int topicId) {
		Topic existingTopic = getTopicById(topicId);
		if(existingTopic != null){
			entityManager.remove(existingTopic);
		} else {
			LOGGER.error("Topic with Id {0}, does not exist. ", topicId);
		}
	}
	
	@Override
	public boolean topicExists(String title, String category) {
		String hql = "FROM Topic as t WHERE t.title = ? and t.category = ?";
		int count = entityManager.createQuery(hql).setParameter(1, title).setParameter(2, category)
				                 .getResultList().size();
		return count > 0 ? true : false;
	}
}
