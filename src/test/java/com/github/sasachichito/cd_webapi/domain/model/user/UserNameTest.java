package com.github.sasachichito.cd_webapi.domain.model.user;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserNameTest {

    @Test
    void throwExceptionWhenNullName() {
        assertThrows(IllegalArgumentException.class, () -> new UserName(null));
    }

    @Test
    void throwExceptionWhenEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> new UserName(""));
    }

    @Test
    void successCreateUserName() {
        UserName userName = new UserName("my_name");
        assertEquals("my_name", userName.name());
    }
}