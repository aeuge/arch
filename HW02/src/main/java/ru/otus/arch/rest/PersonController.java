package ru.otus.arch.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.arch.domain.Status;
import ru.otus.arch.repostory.PersonRepository;

@RestController
public class PersonController {

    private final PersonRepository repository;

    @Autowired
    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/health")
    public Status getAllPersons() {
        Status status = new Status();
        status.setStatus("ok");
        return status;
    }
}
