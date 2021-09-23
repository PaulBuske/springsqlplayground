package com.example.springsqlplayground.Controller;


import com.example.springsqlplayground.Model.Dogs;
import com.example.springsqlplayground.Repository.DogRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogsController {

    private final DogRepository repository;

    public DogsController(DogRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/dogs")
    public Iterable<Dogs> getAllDogsFromDB(){
        return this.repository.findAll();
        //TODO ask Nik about the or predecessors
    }

    @PostMapping("/dogs")
    public void addDogToDatabase(@RequestBody Dogs dogs) {
        this.repository.save(dogs);
    }
}
