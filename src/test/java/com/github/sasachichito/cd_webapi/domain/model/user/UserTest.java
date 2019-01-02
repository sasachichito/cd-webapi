package com.github.sasachichito.cd_webapi.domain.model.user;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserTest {

    @Test
    void throwExceptionWhenNullUserName() {
        assertThrows(IllegalArgumentException.class, () -> new User(null));
    }

    @Test
    void successCreateUserName() {
        UserName userName = new UserName("my_name");
        User user = new User(userName);
        assertEquals("my_name", user.name().name());
    }

}