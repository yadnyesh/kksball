package io.yadnyesh.kksball.repository;

import io.yadnyesh.kksball.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.function.Predicate;

public interface PersonManagementRepository extends CrudRepository<Person, Integer> {
	
	//List<Person> findByLastNameIgnoreCase(String lastName);
	List<Person> findByLastName(String lastName);

}
