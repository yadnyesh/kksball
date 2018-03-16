package io.yadnyesh.kksball.repository.Topic.Impl;

import io.yadnyesh.kksball.entity.Topic.UserInfo;
import io.yadnyesh.kksball.repository.Topic.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public UserInfo getActiveUser(String userName) {
		UserInfo userInfo = new UserInfo();
		short ENABLED = 1;
		
		List<?> list = entityManager.createQuery("SELECT u FROM UserInfo u WHERE username=? and enabled=?")
						.setParameter(1, userName).setParameter(2, ENABLED).getResultList();
		if(!list.isEmpty()) {
			userInfo = (UserInfo) list.get(0);
		}
		
		return userInfo;
	}
}
