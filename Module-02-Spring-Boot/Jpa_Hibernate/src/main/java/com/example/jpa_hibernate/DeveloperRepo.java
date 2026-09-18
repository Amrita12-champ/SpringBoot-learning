package com.example.Jpa_Hibernate;
import com.example.jpa_hibernate.Developer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DeveloperRepo extends CrudRepository<Developer, Integer> {
}