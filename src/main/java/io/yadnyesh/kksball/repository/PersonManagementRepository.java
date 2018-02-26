package io.yadnyesh.kksball.repository;

import io.yadnyesh.kksball.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonManagementRepository extends CrudRepository<Person, Integer> {
	
	@Query("SELECT p FROM Person p WHERE p.firstName =:firstName OR p.lastName=:lastName")
	List<Person> findByLastNameOrFirstName(@Param("lastName") String lastName, @Param("firstName") String firstName);
}
