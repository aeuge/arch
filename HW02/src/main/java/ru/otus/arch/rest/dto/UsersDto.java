/*
 * Copyright 2016 Russian Post
 *
 * This source code is Russian Post Confidential Proprietary.
 * This software is protected by copyright. All rights and titles are reserved.
 * You shall not use, copy, distribute, modify, decompile, disassemble or reverse engineer the software.
 * Otherwise this violation would be treated by law and would be subject to legal prosecution.
 * Legal use of the software provides receipt of a license from the right name only.
 */
package ru.otus.arch.rest.dto;

import ru.otus.arch.domain.Users;

/**
 * DTO that represents Account
 */
@SuppressWarnings("all")
public class UsersDto {

    private int id = -1;
    private String name;

    public UsersDto() {
    }

    public UsersDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static UsersDto toDto(Users users) {
        return new UsersDto(users.getId(), users.getFirstName());
    }
}
