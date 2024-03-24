package com.imbuka.methodref;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable {
    void print(String msg);
}

public class MethodReferenceDemo {

    public void display(String msg) {
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static int addition(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        // method reference to a static method
        //lambda expression

        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(16));

        //using method reference
        Function<Integer, Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(64));

        //lambda expression
        BiFunction<Integer, Integer, Integer> biFunctionLambda = (a , b) -> MethodReferenceDemo.addition(a, b);
        System.out.println(biFunctionLambda.apply(10,20));

        //using method reference
        BiFunction<Integer, Integer, Integer> biFunctionMethodRef = MethodReferenceDemo::addition;
        System.out.println(biFunctionMethodRef.apply(20,40));

        //2. Method Reference to an instance method of an object
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();

        //lambda expression
        Printable printable = (msg ) -> methodReferenceDemo.display(msg);
        printable.print("Mastering Java8");

        //method reference
        Printable printableRef = methodReferenceDemo::display;
        printableRef.print("vile inafaa");

        // 3.Reference to instance method of an arbitrary object (any object/class of a specified class type)
        Function<String, String> stringFunction = (String input) -> input.toLowerCase();
        System.out.println(stringFunction.apply("Germany it is"));

        //using method references
        Function<String, String> stringFunctionRef = String::toLowerCase;
        System.out.println(stringFunctionRef.apply("ALVO MNOMA"));

        //4. reference to constructor
        List<String> fruits = new ArrayList<>();
        fruits.add("water");
        fruits.add("melon");
        fruits.add("mango");
        fruits.add("orange");

        Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(fruits));

        //using method reference
        Function<List<String>, Set<String>> setFunctions = HashSet::new;
        System.out.println(setFunctions.apply(fruits)) ;

    }
}
