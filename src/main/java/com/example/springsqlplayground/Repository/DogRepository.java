package com.example.springsqlplayground.Repository;

import com.example.springsqlplayground.Model.Dogs;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dogs, Long> {
    //can add custom queries here
}
