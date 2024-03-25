package com.imbuka.stream;

import java.util.Collection;
import java.util.List;

public class Stream {
    public static void main(String[] args) {

        List<String> names = List.of("John", "Alice", "Bob");
        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .toList();
        System.out.println(nameLengths);

        System.out.println("============================");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(evenNumbers);

        System.out.println("============================");

        List<String> nemis = List.of("John", "Alice", "Bob");
        List<String> sortedNames = nemis.stream()
                .sorted()
                .toList();
        System.out.println(sortedNames);

        System.out.println("============================");

        List<Integer> nos = List.of(1, 2, 3, 3, 4, 5, 5);
        List<Integer> distinctNumbers = nos.stream()
                .distinct()
                .toList();
        System.out.println(distinctNumbers);

        System.out.println("============================");

        List<Integer> limitNumbers = List.of(1, 5, 3, 4, 5);
        List<Integer> limitedNumbers = limitNumbers.stream()
                .limit(3)
                .toList();
        System.out.println(limitedNumbers);

        System.out.println("============================");
        List<Integer> skipNos = List.of(1, 2, 3, 4, 5);
        List<Integer> skippedNumbers = skipNos.stream()
                .skip(2)
                .toList();
        System.out.println(skippedNumbers);

        System.out.println("============================");

        List<List<Integer>> nestedLists = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6));
        List<Integer> flattenedList = nestedLists.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(flattenedList);

    }
}
