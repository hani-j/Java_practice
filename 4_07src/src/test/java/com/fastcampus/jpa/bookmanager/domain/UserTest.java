package com.fastcampus.jpa.bookmanager.domain;

class UserTest {

    void test() {
        User user = new User();
        user.setEmail("gkdms4248@mail.com");
        user.setName("haeun");

        System.out.println(">>> "+user);
    }
}