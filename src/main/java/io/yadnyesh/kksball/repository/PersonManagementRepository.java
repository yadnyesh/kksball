package io.yadnyesh.kksball.repository;

import io.yadnyesh.kksball.entity.Person;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonManagementRepository extends CrudRepository<Person, Integer> {

}
