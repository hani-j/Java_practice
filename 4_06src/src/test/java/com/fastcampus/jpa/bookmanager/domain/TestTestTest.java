package com.fastcampus.jpa.bookmanager.domain;

import com.fastcampus.jpa.bookmanager.repository.TestTestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestTestTest {

    @Autowired
    private TestTestRepository testTestRepository;

    @Test
    public void test(){
        TestTest testTest = new TestTest();

        testTest.setName("haeun");
        testTest.setNickname("hjeong");

        testTestRepository.save(testTest);

        testTest.setName("martin");

        testTestRepository.save(testTest);
        testTestRepository.findAll().forEach(System.out::println);
    }
}