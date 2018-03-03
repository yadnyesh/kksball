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

}
