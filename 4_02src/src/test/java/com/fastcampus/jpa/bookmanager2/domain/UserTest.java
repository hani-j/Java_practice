package com.fastcampus.jpa.bookmanager2.domain;

import org.junit.jupiter.api.Test;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setEmail("gkdms4248@mail.com");
        user.setName("haeun");

        // NonNull 사용한 것들
        User user1 = new User("gg@gg.gg", "gg");

        // Builder
        User user2 = User.builder()
                .name("martin")
                .email("martin@fastcampus.com")
                .build();

        System.out.println(">>> " + user);
        System.out.println(">>> " + user1);
        System.out.println(">>> " + user2);
    }
}