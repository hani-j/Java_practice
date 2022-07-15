package com.fastcampus.jpa.bookmanager.service;

import com.fastcampus.jpa.bookmanager.domain.User;
import com.fastcampus.jpa.bookmanager.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
@Transactional
public class EntityManagerTest {
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private UserRepository userRepository;

    @Test
    void entityManagerTest() {
        System.out.println(entityManager.createQuery("select u from User u").getResultList());
        // == userRepository.findAl()
    }

    @Test
    void cacheFindTest() {
        // 얘는 안됨
//        System.out.println(userRepository.findByEmail("martin@fastcampus.com"));

        // @Transactional 을 붙이면 세번 찾지 않고 한번 찾고 세번 출력 -> cache 가 해줌. 1차 캐시?
        // id 값으로 조회할 때만
        System.out.println(userRepository.findById(2L).get());
        System.out.println(userRepository.findById(2L).get());
        System.out.println(userRepository.findById(2L).get());

        userRepository.deleteById(1L);
    }

    @Test
    void cacheFindTest2() {
        User user = userRepository.findById(1L).get();
        user.setName("marrrrrrtin");
        userRepository.save(user);
//        userRepository.flush();

        System.out.println("------------------------------------");

        user.setEmail("marrrrrrtin@fastcampus.com");
        userRepository.save(user);
        userRepository.flush();

        // 먼저 출력 후 update
//        System.out.println(">>> 1 : "+userRepository.findById(1L).get());
//        userRepository.flush();
//        System.out.println(">>> 2 : "+userRepository.findById(1L).get());

        // 아직 db 반영 전
        // db 로 다 반영 후 가져오는 식
        System.out.println(userRepository.findAll());
    }
}
