package ru.otus.arch.repostory;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.otus.arch.domain.Users;

import java.util.List;

public interface UsersRepository extends MongoRepository<Users, String> {

    List<Users> findAll();
    Users findByObjectId(String objectId);
}
