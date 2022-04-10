package com.examly.springapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutesRepository extends CrudRepository<Institutes, Integer>{
    
}
