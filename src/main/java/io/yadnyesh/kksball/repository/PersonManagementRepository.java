package io.yadnyesh.kksball.repository;

import io.yadnyesh.kksball.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonManagementRepository extends CrudRepository<Person, Integer> {
	
	List<Person> findByLastName(String lastName);

}
