package com.fastcampus.jpa.bookmanager2.repository;

import com.fastcampus.jpa.bookmanager2.domain.Gender;
import com.fastcampus.jpa.bookmanager2.domain.User;
import com.fastcampus.jpa.bookmanager2.domain.UserHistory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

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

    @Test
    void userRelationTest(){
        User user = new User();
        user.setName("david");
        user.setEmail("david@fastcampus.com");
        user.setGender(Gender.MALE);
        userRepository.save(user);

        user.setName("daniel");
        userRepository.save(user);

        user.setEmail("daniel@fastcampus.com");
        userRepository.save(user);

        // list 를 이쁘게 출력..?
//        userHistoryRepository.findAll().forEach(System.out::println);

        // userId 를 통해서
//        List<UserHistory> result = userHistoryRepository.findByUserId(
//                userRepository.findByEmail("daniel@fastcampus.com").getId());


        // getter 을 통해서
        List<UserHistory> result = userRepository.findByEmail("daniel@fastcampus.com").getUserHistories();

        result.forEach(System.out::println);

        // N대1
        System.out.println("UserHistory.getUser() : " + userHistoryRepository.findAll().get(0).getUser());
    }
}