package com.github.sasachichito.cd_webapi.application.presentationmodel;

import com.fasterxml.jackson.annotation.JsonValue;
import com.github.sasachichito.cd_webapi.domain.model.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Users {

    @JsonValue
    private List<String> userNames;

    public Users(List<User> users) {
        this.initializeFrom(users);
    }

    private void initializeFrom(List<User> users) {
        this.userNames = users == null ?
            new ArrayList<>()
            : users.stream().map(user -> user.name().name()).collect(Collectors.toList());
    }
}
