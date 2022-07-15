package com.fastcampus.jpa.bookmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableJpaAuditing // 방법 2 JpaConfiguration 에다가
//@EnableJpaRepositories("com.fastcampus.jpa.bookmanager.repository")
@SpringBootApplication(scanBasePackages = {"com.fastcampus.jpa.bookmanager"})
public class BookmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookmanagerApplication.class, args);
    }

}
