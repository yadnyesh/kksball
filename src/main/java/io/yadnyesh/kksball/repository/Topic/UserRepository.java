package io.yadnyesh.kksball.repository.Topic;

import io.yadnyesh.kksball.entity.Topic.UserInfo;

public interface UserRepository {
	public abstract UserInfo getActiveUser(String userName);
}
