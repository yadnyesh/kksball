package io.yadnyesh.kksball.repository.Topic;

import io.yadnyesh.kksball.entity.Topic.Topic;

import java.util.List;

public interface TopicRepository {
	public abstract List<Topic> getAllTopics();
	public abstract Topic getTopicById(int topicId);
	public abstract void addTopic(Topic topic);
	public abstract void updateTopic(Topic topic);
	public abstract void deleteTopic(int topicId);
	public abstract boolean topicExists(String title, String Category);
}
