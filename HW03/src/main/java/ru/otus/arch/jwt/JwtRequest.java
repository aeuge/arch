package ru.otus.arch.jwt;

import lombok.Data;
import java.io.Serializable;

@Data
public class JwtRequest implements Serializable {
    private String username;
    private String password;

    public JwtRequest(){}

    public JwtRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }
}
