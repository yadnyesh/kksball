package io.yadnyesh.kksball.repository;

import io.yadnyesh.kksball.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by z063407 on 6/7/18.
 */
@Repository
public class EmployeeSpringJDBCRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void createEmployee(Employee employee) {
		String sql = "insert into employee_table(email, employee_name, salary) values (?,?,?)";
		jdbcTemplate.update(sql, employee.getEmail(), employee.getEmployeeName(), employee.getSalary());
	}
	
}
