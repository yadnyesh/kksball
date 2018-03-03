package io.yadnyesh.kksball.repository;

import io.yadnyesh.kksball.entity.Person;
import org.springframework.data.repository.CrudRepository;


public interface PersonManagementRepository extends CrudRepository<Person, Integer> {

}
