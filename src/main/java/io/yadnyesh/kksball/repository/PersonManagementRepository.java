package io.yadnyesh.kksball.repository;

import io.yadnyesh.kksball.entity.Person;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.function.Predicate;

public interface PersonManagementRepository extends CrudRepository<Person, Integer> {
	
	List<Person> findByLastNameIgnoreCase(String lastName);
	
//	@Query(value = "SELECT * FROM person WHERE last_name = ?1", nativeQuery = true)
    List<Person> findByLastName(String lastName, Pageable pageable);

}
