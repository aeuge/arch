package ru.otus.arch.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.otus.arch.domain.Status;
import ru.otus.arch.domain.Users;
import ru.otus.arch.repostory.UsersRepository;

import java.util.List;

@RestController
public class UsersController {

    private final UsersRepository repository;

    @Autowired
    public UsersController(UsersRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/health")
    public Status getHealth() {
        Status status = new Status();
        status.setStatus("ok");
        return status;
    }
    @GetMapping("/api/v1/users")
    public List<Users> getAllUsers() {
        return repository.findAll();
    }
    @GetMapping("/api/v1/users/{objectId}")
    public Users getUser(@PathVariable String objectId) {
        return repository.findByObjectId(objectId);
    }
    @PostMapping("/api/v1/users")
    public Users addUsers(@RequestBody Users user) {
        return repository.save(user);
    }
    @PutMapping("/api/v1/users")
    public Users updateUsers(@RequestBody Users user) {
        return repository.save(user);
    }
    @PutMapping("/api/v1/users/{objectId}")
    public Users addUsersByObject(@PathVariable String objectId, @RequestBody Users user) {
        return repository.save(user);
    }
    @DeleteMapping("/api/v1/users/{objectId}")
    public void removeUsers(@PathVariable String objectId) {
        repository.deleteById(objectId);
    }
}
