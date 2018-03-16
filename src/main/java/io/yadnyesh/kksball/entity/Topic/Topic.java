package io.yadnyesh.kksball.entity.Topic;

import javax.persistence.*;

@Entity
@Table(name = "topics")
public class Topic {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="topic_id")
	private int topicId;
	
	@Column(name="title", length = 100, nullable = false)
	private String title;
	
	@Column(name="category", length = 100, nullable = false)
	private String category;
	
	public Topic() {
	}
	
	public int getTopicId() {
		return topicId;
	}
	
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
}
