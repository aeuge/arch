package ru.otus.arch.repostory;

import org.springframework.data.repository.CrudRepository;
import ru.otus.arch.domain.Users;

import java.util.List;

public interface PersonRepository extends CrudRepository<Users, Integer> {

    List<Users> findAll();
}
