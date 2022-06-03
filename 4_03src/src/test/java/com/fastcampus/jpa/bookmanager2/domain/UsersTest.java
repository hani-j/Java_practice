package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

class UsersTest {
    @Test
    void test() {
        Users users = new Users();
        users.setEmail("gkdms4248@mail.com");
        users.setName("haeun");

        // NonNull 사용한 것들
        Users user1 = new Users("gg@gg.gg", "gg");

        // Builder
        Users user2 = Users.builder()
                .name("martin")
                .email("martin@fastcampus.com")
                .build();

        System.out.println(">>> " + users);
        System.out.println(">>> " + user1);
        System.out.println(">>> " + user2);
    }
}