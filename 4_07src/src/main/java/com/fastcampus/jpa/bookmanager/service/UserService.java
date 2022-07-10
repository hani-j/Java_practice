package com.fastcampus.jpa.bookmanager.service;

import com.fastcampus.jpa.bookmanager.domain.User;
import com.fastcampus.jpa.bookmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
public class UserService {
    @Autowired
    private EntityManager entityManager;
    // 방법 1
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void put() {
        // 비영속 상태
        User user = new User();
        user.setName("newUser");
        user.setEmail("newUser@fastcampus.com");

        // 영속 상태 : 영속성 컨텍스트 안에서 관리되는 상태 : 객체의 변화를 별도로 처리해주지 않아도 db에 반영
        // 방법 1
//        userRepository.save(user);

        // 방법 2
        entityManager.persist(user);

        // 준 영속상태 : detach
//        entityManager.detach(user);

        user.setName("newUserAfterPersist"); // 반영되지 않음
        entityManager.merge(user); // 반영
//        entityManager.flush();
//        entityManager.clear(); // 변경 된 내용 clear -> 앞에 flush 추가

        // 삭제 상태
//        entityManager.remove(user); // datach 충돌

        User user1 = userRepository.findById(1L).get();
        entityManager.remove(user1);

        user1.setName("marrrrrrrrtin");
//        entityManager.merge(user1); // 오류
    }
}
