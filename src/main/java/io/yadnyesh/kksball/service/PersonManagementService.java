package io.yadnyesh.kksball.service;

import com.sun.xml.internal.ws.util.CompletedFuture;
import io.yadnyesh.kksball.entity.Person;
import io.yadnyesh.kksball.repository.PersonManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class PersonManagementService {

	@Autowired
	PersonManagementRepository personManagementRepository;
	
	public Person createPerson(Person person){
		return personManagementRepository.save(person);
	}
	
	public Iterable<Person> createMultiPerson(List<Person> personList) {
		Iterable<Person> savedPersonList = personManagementRepository.save(personList);
		return savedPersonList;
	}
	
	public List<Person> findByLastNameOrFirstName(String lastName, String firstName) {
		return personManagementRepository.findByLastNameOrFirstName(lastName, firstName);
	}
	
	public Iterable<Person> getPersonByIds(List<Integer> ids) {
		return personManagementRepository.findAll(ids);
	}
	
	public void deletePerson(Person person){
		personManagementRepository.delete(person);
	}
	
//	public List<Person> getPersonByLastName(String lastName, PageRequest pageRequest) {
//		//return personManagementRepository.findByLastNameIgnoreCase(lastName);
//		return personManagementRepository.findByLastName(lastName, pageRequest);
//
//	}
	
	public void updatePersonEmailById(int id, String newEmail){
		Person person = personManagementRepository.findOne(id);
		if(id == person.getId()){
			person.setEmail(newEmail);
		}
		personManagementRepository.save(person);
	}
}
