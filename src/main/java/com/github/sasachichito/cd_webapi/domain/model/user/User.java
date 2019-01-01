package com.github.sasachichito.cd_webapi.domain.model.user;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class User {

    private UserName userName;

    public User(UserName userName) {
        this.userName = userName;
    }

    public UserName name() {
        return this.userName;
    }
}
