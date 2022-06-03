package com.fastcampus.jpa.bookmanager2.repository;

import com.fastcampus.jpa.bookmanager2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

// jpa 지원
public interface UserRepository extends JpaRepository<User, Long> {


}
