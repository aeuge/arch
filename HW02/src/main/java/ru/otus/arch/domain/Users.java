package ru.otus.arch.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;
import java.util.Date;

@Data
@Document("users")
public class Users {
    @Id
    private int id;
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
