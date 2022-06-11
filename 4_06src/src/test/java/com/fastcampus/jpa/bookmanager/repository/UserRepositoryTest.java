package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserHistoryRepository userHistoryRepository;

    @Test
    void listenerTest() {
        User user = new User();
        user.setEmail("martin2@fastcampus.com");
        user.setName("martin");

        userRepository.save(user);

        User user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user2.setName("marrrrrrtin");

        userRepository.save(user2);

        userRepository.deleteById(4L);
    }

    @Test
    void prePersistTest(){
        User user = new User();
        user.setEmail("martin2@fastcampus.com");
        user.setName("martin");
//        user.setCreatedAt(LocalDateTime.now()); // set 을 많이 쓰는 것 지양
//        user.setUpdatedAt(LocalDateTime.now()); // @PrePersist 메서드에다가 정의

        userRepository.save(user);

        System.out.println(userRepository.findByEmail("martin2@fastcampus.com"));
    }

    @Test
    void preUpdateTest(){
        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);

        System.out.println("as-is : " + user);

        user.setName("martin22");
        userRepository.save(user);

        System.out.println("to-be : " + userRepository.findAll().get(0));
    }

    @Test
    void userHistoryTest(){
        User user = new User();
        user.setEmail("martin-new@fastcampus.com");
        user.setName("martin-new");

        userRepository.save(user);

        user.setName("martin-new-new");

        userRepository.save(user);

        userHistoryRepository.findAll().forEach(System.out::println);

    }
}