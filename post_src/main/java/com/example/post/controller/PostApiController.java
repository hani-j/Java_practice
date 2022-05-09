package com.example.post.controller;


import com.example.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    //public void post(@RequestBody Map<String, Object> requestData){ // 방법 1
    public void post(@RequestBody PostRequestDto requestData){ // 방법 2
//        requestData.entrySet().forEach(stringObjectEntry -> {
//            System.out.println("key : "+stringObjectEntry.getKey());
//            System.out.println("value : "+stringObjectEntry.getValue());
//        }); ==> Alt + Enter

//        requestData.forEach((key, value) -> {
//            System.out.println("key : " + key);
//            System.out.println("value : " + value);
//        });

        System.out.println(requestData);
        // requestData.getAccount() 활용
    }
}
