package me.whiteship.java8to17;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        // static 메소드 참조
        UnaryOperator<String> hi = Greeting::hi;

        // 특정 객체의 Instance 메소드 참조
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply("keesun"));

        // 기본 생성자
        Supplier<Greeting> newGreeting= Greeting::new;
        newGreeting.get();

        // 문자열 하나 받는 생성자
        Function<String, Greeting> keesunGreeting = Greeting::new;
        Greeting keesun = keesunGreeting.apply("keesun");
        System.out.println(keesun.getName());

        // 임의의 객체의 Instance 메소드 참조
        String[] names = {"keesun", "whiteship", "toby"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
