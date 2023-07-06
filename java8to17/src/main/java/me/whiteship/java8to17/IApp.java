package me.whiteship.java8to17;

public class IApp {
    public static void main(String[] args) {
        IFoo foo = new DefaultFoo("keesun");
        foo.printName();
        foo.printNameUpperCase();
    }
}
