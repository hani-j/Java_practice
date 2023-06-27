package me.whiteship.java8to17;
// 함수형 인터페이스 (Functional Interface) : (abstract) 함수 무조건 하나 들어있는 interface
@FunctionalInterface
public interface RunSomething {

    abstract int doIt(int number);

    // 다른 형태의 메서드
//    public static void printName() {
//        System.out.println("Keesun");
//    }
//
//    default void printAge() {
//        System.out.println("38");
//    }
}
