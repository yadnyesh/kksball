package io.yadnyesh.kksball.repository;

import io.yadnyesh.kksball.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.CompletableFuture;

public interface PersonManagementRepository extends CrudRepository<Person, Integer> {
	
	@Async
	CompletableFuture<Person> findByEmail(String email);
}
