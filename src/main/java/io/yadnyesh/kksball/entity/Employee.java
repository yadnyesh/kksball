package io.yadnyesh.kksball.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="employee_table")
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="employee_table_employee_id_seq", sequenceName = "employee_table_employee_id_seq")
	@Column(name="employee_id")
	private Integer employeeId;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="salary")
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
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		Employee employee = (Employee) o;
		return Objects.equals(employeeId, employee.employeeId) && Objects.equals(employeeName, employee.employeeName) && Objects
				.equals(email, employee.email) && Objects.equals(salary, employee.salary);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName, email, salary);
	}
	
	@Override
	public String toString() {
		return "Employee{" + "employeeId=" + employeeId + ", employeeName='" + employeeName + '\'' + ", email='" + email + '\'' + ", salary=" + salary + '}';
	}
}
