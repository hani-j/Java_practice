package me.whiteship.java8to17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class ApiApp {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("keesun");
        name.add("whiteship");
        name.add("toby");
        name.add("foo");

        /* Iterable - forEach(), spliterator() */
        name.forEach((s) -> {
            System.out.println(s);
        });
        name.forEach(System.out::println);

        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("====================");
        while (spliterator1.tryAdvance(System.out::println));


        /* Collection - stream(), removeIf(), spliterator() */
        name.removeIf(s -> s.startsWith("k"));
        name.forEach(System.out::println);


        /* Comparator - reversed(), thenComparing() */
        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed());
        name.forEach(System.out::println);

    }
}
