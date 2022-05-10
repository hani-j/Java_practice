package com.example.hello.controller;


import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")  // http://localhost:8080/api/get/hello
    public String getHello(){
        return "get Hello";
    }

    // 예전에 쓰던 방식
    // path + method => GetMapping
    @RequestMapping(path = "/hi",  method = RequestMethod.GET) // get / post / put / delete
    public String hi(){
        return "hi";
    }

    // http://localhost:8080/api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}") // 대문자 대신 -
    // public String pathVariable(@PathVariable String name){
    // 이름을 일치시킬 수 없을 때
    public String pathVariable(@PathVariable(name = "name") String pathName){
        System.out.println("PathVariable : "+pathName);
        return pathName;
    }

    // 방법 1
    // ?key=value&key2=value2
    // http://localhost:8080/api/get/query-param?user=steve&email=steve@gmail.com&age=30
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){

        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()+" = "+entry.getValue()+"\n");
        });
        return sb.toString();
    }

    // 방법 2 : 많아지게되면
    @GetMapping("query-param02")
    public String queryParam02(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam int age // 문자를 넣게 되면 에러
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name + " "+email+" "+age;
    }

    // 방법 3 : 가장 많이쓰는 방식
    // dto 패키지에 객체를 미리 정의
    // @RequestParam 붙이지 않음 spring boot에서 판단을 함
    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
