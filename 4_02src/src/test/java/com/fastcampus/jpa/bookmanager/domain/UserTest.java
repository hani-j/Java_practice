package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        Users user = new Users();
        user.setEmail("gkdms4248@mail.com");
        user.setName("haeun");

        // NonNull 사용한 것들
        Users user1 = new Users("gg@gg.gg", "gg");

        // Builder
        Users user2 = Users.builder()
                .name("martin")
                .email("martin@fastcampus.com")
                .build();

        System.out.println(">>> " + user);
        System.out.println(">>> " + user1);
        System.out.println(">>> " + user2);
    }
}