package ru.otus.arch.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document("users")
public class Users {
    @Id
    private String objectId;
    private String firstName;
    private String lastName;
    private Date createdAt = new Date();
    private String login;
    private String email;
    private String phone;

    public Users() {
    }

    public Users(String s) {
        this.login = s;
    }
}
