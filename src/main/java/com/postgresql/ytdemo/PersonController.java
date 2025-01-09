package com.postgresql.ytdemo;


import com.postgresql.ytdemo.model.Person;
import com.postgresql.ytdemo.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    PersonRepo repo;

    @PostMapping("/addPerson")
    public String addPerson(@RequestBody Person person) {
        repo.save(person);
        return "succesfull add new person";
    }
}
