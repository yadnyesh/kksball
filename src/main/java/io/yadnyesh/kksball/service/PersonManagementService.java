package io.yadnyesh.kksball.service;

import io.yadnyesh.kksball.repository.PersonManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonManagementService {

	@Autowired
	PersonManagementRepository personManagementRepository;

}
