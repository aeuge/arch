package ru.otus.arch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import ru.otus.arch.domain.Users;
import ru.otus.arch.repostory.UsersRepository;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableMongoRepositories
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    @Autowired
    private UsersRepository repository;

    @PostConstruct
    public void init() {
        repository.save(new Users("Pushkin"));
        repository.save(new Users("Lermontov"));
    }
}
