package io.yadnyesh.kksball.repository;

import com.sun.xml.internal.ws.util.CompletedFuture;
import io.yadnyesh.kksball.entity.Person;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public interface PersonManagementRepository extends CrudRepository<Person, Integer> {

}
