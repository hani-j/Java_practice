package com.fastcampus.jpa.bookmanager2.repository;

import com.fastcampus.jpa.bookmanager2.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void crud() {
        // 전체 출력
//        userRepository.save(new User());
//        userRepository.findAll().forEach(System.out::println);

        // 이름 역순으로 출력
//        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
//        users.forEach(System.out::println);

        // Lists.newArrayList() 값을 직접 넣기
//        List<User> users = userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L));
//        users.forEach(System.out::println);

        // 저장
//        User user1 = new User("jack", "jack@fastcampus.com");
//        User user2 = new User("steve", "steve@fastcampus.com");
//
//        userRepository.saveAll(Lists.newArrayList(user1, user2));
//
//        List<User> users = userRepository.findAll();
//        users.forEach(System.out::println);

        // no Session. lazy 패치를 지원
        // @Transactional 추가. print 할 때까지 session이 유지
//        User user = userRepository.getOne(1L);
//        System.out.println(user);

        // 무슨 패치..
//        Optional<User> user = userRepository.findById(1L);
//        User user = userRepository.findById(1L).orElse(null); // 없으면 null 반환
//        System.out.println(user);

        // flush : db 반영 시점을 조절. 동작을 확인하기는 어려움
//        userRepository.save(new User("new martin", "newmartin@fastcampus.com"));
//        userRepository.flush();
//        userRepository.findAll().forEach(System.out::println);

        // count
//        long count = userRepository.count();
//        System.out.println(count);

        // existsById count query 가 조회가 됨
//        boolean exists = userRepository.existsById(1L);
//        System.out.println(exists);

//        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));

//        userRepository.deleteAll();
//        userRepository.findAll().forEach(System.out::println);

        // paging
//        Page<User> users = userRepository.findAll(PageRequest.of(1, 3));
//        System.out.println("page : "+users);
//        System.out.println("totalElements : " + users.getTotalElements());
//        System.out.println("totalPages : " + users.getTotalPages());
//        System.out.println("numberOfElements : " + users.getNumberOfElements());
//        System.out.println("sort : " + users.getSort());
//        System.out.println("size : " + users.getSize());
//
//        users.getContent().forEach(System.out::println);

        // Example
//        ExampleMatcher matcher = ExampleMatcher.matching()
//                .withIgnorePaths("name") // name 은 매칭하지 않겠다
//                .withMatcher("email", endsWith()); // 매칭하겠다
//        Example<User> example = Example.of(new User("ma", "fastcampus.com"), matcher);

//        Example<User> example = Example.of(new User("martin", "martin@fastcampus.com"));

        // 양방향 검색
        // String 만 검색할 수 있다는 단점. query DSL 을 더 사용
//        User user = new User();
//        user.setEmail("slow");
//        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("email", contains());
//        Example<Users> example = Example.of(user, matcher);
//        userRepository.findAll(example).forEach(System.out::println);


        // update
        userRepository.save(new User("david", "david@fastcampus.com"));

        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setEmail("martin-update@fastcampus.com");
        // 위는 insert 아래는 up
        userRepository.save(user);
    }
}