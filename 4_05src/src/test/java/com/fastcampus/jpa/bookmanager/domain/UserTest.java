package com.fastcampus.jpa.bookmanager.domain;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    void test() {
        User user = new User();
        user.setEmail("gkdms4248@mail.com");
        user.setName("haeun");

        System.out.println(">>> "+user);
    }
}