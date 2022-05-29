package com.fastcampus.jpa.bookmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class BookmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookmanagerApplication.class, args);
    }

}
