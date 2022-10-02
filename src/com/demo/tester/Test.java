package com.demo.tester;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

class Point {
    int x;
    int y;

    static int instances = 0;
    static void incrementInstance(){
        instances++;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        instances++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

//record Point(int x, int y) {
//    @Override
//    public int x() {
//        return x;
//    }
//
//    @Override
//    public int y() {
//        return y;
//    }
//}

public class Test {
    public static void arrayStream() {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Ristretto", "Lungo", "Macchiato",
                "Marocchino"};

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 7, 13);
//        Arrays.fill(copyFrom, "tar");
//        for (String coffee : copyTo) {
//            System.out.print(coffee + " ");
//        }
        System.out.println();

        for (String coffee : copyFrom) {
            System.out.print(coffee + " ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(copyFrom, "Corretto"));
        System.out.println(Arrays.equals(copyFrom, copyTo));
        Arrays.parallelSort(copyTo, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(copyTo));
        List<String> result = Arrays.stream(copyTo).filter(st -> st.charAt(0) == 'F').map(stf -> stf + " Coffee").toList();
//        List<String> copyToList =  Arrays.stream(copyTo).toList();
        List<String> copyToList = Arrays.stream(copyTo).sorted((a, b) -> a.length() - b.length()).toList();

        System.out.println(copyToList);
    }

    static void randomNumberGenerator(){
//        Random random = new Random(314L);
        //testing Bi Consumer
        BiConsumer<Random, Integer> randomPrinter = (random, num) -> {
            for (int i = 0; i < num; i++) {
                System.out.println(random.nextInt());
            }
        };
        randomPrinter.accept(new Random(314L), 5);
    }

    // Testing Predicate Interface
    static boolean checkWordLength(String word, Integer length){
        BiPredicate<String, Integer> checkWordlength = (str, len) -> str.length() == len;

        return checkWordlength.test(word, length);
    }

    static void findWordInSentence(){
        BiFunction<String, String, Integer> findWord = (word, sentence) -> sentence.indexOf(word);
        String sen = "I am Saksham, a java developer";
        String word = "Saksham";
        System.out.println(findWord.apply(word, sen));
    }

    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);
        IntSupplier side = () -> 6; // Supplier interface
        Supplier<Point> pointObjects = () -> new Point(5, 6);
        Consumer printer = (s) -> System.out.println(s);
        int sides = side.getAsInt();
//        changePoint(p1);
//        System.out.println(p1);
//        changeSides(sides);
        System.out.println(sides);
        printer.accept(sides);
        System.out.println(pointObjects.get());
        System.out.println(checkWordLength("let", 4));
//        Point.incrementInstance();
//        System.out.println(Point.instances);
//        randomNumberGenerator();
        findWordInSentence();
    }

    static void changePoint(Point p){
        p.setX(5);
        p.setY(10);
    }

    static void changeSides(int side){
        side = 8;
    }

}
