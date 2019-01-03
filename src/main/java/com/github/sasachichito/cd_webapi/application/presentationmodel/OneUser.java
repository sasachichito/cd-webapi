package com.github.sasachichito.cd_webapi.application.presentationmodel;

import com.fasterxml.jackson.annotation.JsonValue;
import com.github.sasachichito.cd_webapi.domain.model.user.User;

public class OneUser {

    @JsonValue
    private String userName;

    public OneUser(User user) {
        this.initializeFrom(user);
    }

    private void initializeFrom(User user) {
        if (user == null) {
            this.userName = "";
            return;
        }
        this.userName = user.name().name();
    }

}
