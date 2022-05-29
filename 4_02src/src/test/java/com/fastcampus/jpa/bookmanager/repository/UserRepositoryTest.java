package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.Users;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void crud(){
        // 전체 출력
//        userRepository.save(new Users());
//        userRepository.findAll().forEach(System.out::println);

        // 이름 역순으로 출력
//        List<Users> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
//        users.forEach(System.out::println);

        // Lists.newArrayList() 값을 직접 넣기
//        List<Users> users = userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L));
//        users.forEach(System.out::println);

        // 저장
//        Users user1 = new Users("jack", "jack@fastcampus.com");
//        Users user2 = new Users("steve", "steve@fastcampus.com");
//
//        userRepository.saveAll(Lists.newArrayList(user1, user2));
//
//        List<Users> users = userRepository.findAll();
//        users.forEach(System.out::println);

        // no Session. lazy 패치를 지원
        // @Transactional 추가. 그래도 오류..?
//        Users user = userRepository.getOne(1L);
//        System.out.println(user);

        // 무슨 패치..
//        Users user = userRepository.findById(1L).orElse(null);
//        System.out.println(user);

        // flush 동작을 확인하기는 어려움
        userRepository.save(new Users("new martin", "newmartin@fastcampus.com"));
        userRepository.flush();
        userRepository.findAll().forEach(System.out::println);

        // count
        long count = userRepository.count();
        System.out.println(count);

        // existsById
        boolean exists = userRepository.existsById(1L);
        System.out.println(exists);
    }
}