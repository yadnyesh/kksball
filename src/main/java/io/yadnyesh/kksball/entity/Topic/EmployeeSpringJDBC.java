package io.yadnyesh.kksball.entity.Topic;

import io.yadnyesh.kksball.entity.Employee;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by z063407 on 6/7/18.
 */
public class EmployeeSpringJDBC {
	

	private Integer employeeId;

	private String employeeName;
	
	private String email;
	
	private Double salary;
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee{" + "employeeId=" + employeeId + ", employeeName='" + employeeName + '\'' + ", email='" + email + '\'' + ", salary=" + salary + '}';
	}
}
