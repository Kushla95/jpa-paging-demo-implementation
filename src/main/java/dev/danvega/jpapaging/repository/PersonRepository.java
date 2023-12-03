package dev.danvega.jpapaging.repository;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.Repository;

import dev.danvega.jpapaging.model.Person;

public interface PersonRepository extends PagingAndSortingRepository<Person,Integer> {

}
