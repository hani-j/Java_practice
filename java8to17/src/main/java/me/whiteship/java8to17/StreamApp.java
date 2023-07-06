package me.whiteship.java8to17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("keesun");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");

        // 데이터를 바꾸지 않는다
        Stream<String> stringStream = names.stream().map(String::toUpperCase);

        // 중개 오퍼레이션 - 종료가 적어도 하나는 있어야한다. 실행 안함
        Stream<String> stringStream1 = names.stream().map((s) -> {
            System.out.println(s);
            return s.toUpperCase();
        });

        // 종료 오퍼레이션
        List<String> collect = names.stream().map((s) -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());

        names.forEach(System.out::println);

        // 쉽게 병렬 처리 할 수 있음
        names.parallelStream().map(String::toUpperCase)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
