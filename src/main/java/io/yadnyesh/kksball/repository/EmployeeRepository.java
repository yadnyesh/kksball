package io.yadnyesh.kksball.repository;

import io.yadnyesh.kksball.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
