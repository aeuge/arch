package ru.otus.arch.jwt;

import lombok.Data;
import java.io.Serializable;

@Data
public class JwtResponse implements Serializable {
    private final String token;

    public JwtResponse(String jwttoken) {
        this.token = jwttoken;
    }
}