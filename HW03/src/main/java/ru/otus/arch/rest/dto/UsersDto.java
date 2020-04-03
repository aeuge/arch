package ru.otus.arch.rest.dto;

import lombok.Data;
import ru.otus.arch.domain.Users;

/**
 * DTO that represents Users
 */
@SuppressWarnings("all")
@Data
public class UsersDto {

    private String id;
    private String name;

    public UsersDto() {
    }

    public UsersDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static UsersDto toDto(Users users) {
        return new UsersDto(users.getObjectId(), users.getFirstName());
    }
}
