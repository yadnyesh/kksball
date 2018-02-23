package io.yadnyesh.kksball.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="person_id")
	private Integer id;
	
	@Column(name="first_name", length = 60, nullable = false)
	private String firstName;
	
	@Column(name="last_name", length = 60, nullable = false)
	private String lastName;
	
	@Column(name="email", unique = true)
	private String email;
	
	@Column(name="create_date")
	private Date createdDate;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public Person() {
	
	}
	
	public Person(String firstName, String lastName, String email, Date createdDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.createdDate = createdDate;
	}
	
	public Person(Integer id, String firstName, String lastName, String email, Date createdDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.createdDate = createdDate;
	}
	
	@Override
	public String toString() {
		return "Person{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", createdDate=" + createdDate + '}';
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		Person person = (Person) o;
		return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects
				.equals(email, person.email) && Objects.equals(createdDate, person.createdDate);
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(id, firstName, lastName, email, createdDate);
	}
}
