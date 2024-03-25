package com.imbuka;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);


        numbers.peek(System.out::println)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}