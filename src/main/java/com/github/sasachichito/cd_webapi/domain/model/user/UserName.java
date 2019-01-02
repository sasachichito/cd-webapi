package com.github.sasachichito.cd_webapi.domain.model.user;

public class UserName {

    private String name;

    public UserName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name must be not empty");
        }
        this.name = name;
    }

    public String name() {
        return this.name;
    }
}
