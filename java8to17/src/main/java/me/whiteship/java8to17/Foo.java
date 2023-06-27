package me.whiteship.java8to17;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;

public class Foo {

    public static void main(String[] args) {
        /* 익명 내부 클래스 (anoymous inner class) => 줄여서 쓸 수 있는 방법 나옴 (Option + Enter) */
        RunSomething runSomething = (number) -> {
            return number + 10;
        };
        System.out.println(runSomething.doIt(1));


        /* 자바에서 제공하는 함수형 인터페이스 */
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        // 함수 조합
        System.out.println(plus10.compose(multiply2).apply(2)); // * 하고 +
        System.out.println(plus10.andThen(multiply2).apply(2)); // + 하고 *
        System.out.println(plus10.apply(2));


        /* 람다 표현식 */
        int baseNumber = 10; // 이전에는 final 붙은 것만 쓸 수 있었다
        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11; // 위 변수가 가려짐 => 쉐도잉
                System.out.println(baseNumber);
            }
        }
        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };
        // 람다
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };
    }
}
