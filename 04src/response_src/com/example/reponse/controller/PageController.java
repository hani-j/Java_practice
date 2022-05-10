package com.example.reponse.controller;

import com.example.reponse.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// page. html 파일을 리턴하는 컨트롤러
@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    } // String 이 들어오면 자동으로

    // ResponseEntity

    // resource 를 찾지 않고 body를 만들어서 내리겠다
    // 선호하지 않음
    @ResponseBody
    @GetMapping("/user")
    public User user(){
        var user = new User(); // 타입 추론?
        user.setName("steve");
        user.setAddress("패스트 캠퍼스");
        return user;
    }
}
