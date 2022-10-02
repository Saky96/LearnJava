package com.demo.generics;

import java.util.*;

public class Equality<T> {
    T value1;
    T value2;

    public Equality(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    boolean equalityTetser(){
        return this.value1.equals(this.value2);
    }
}

class ArraylengthEquality<T1, T2>{
    T1[] arr1;
    T2[] arr2;

    String lengthTester(T1[] arr1, T2[] arr2){
        return arr1.length == arr2.length ? "Equal" : "not Equal";
    }
}

class Tester{
    public static void main(String[] args) {
        Equality<String> strObj = new Equality<String>("hi", "hi");
        System.out.println(strObj.equalityTetser());
        Equality<Integer> intObj = new Equality<Integer>(1, 0+1);
        System.out.println(intObj.equalityTetser());

        List<String> strList = new ArrayList<String>();
        strList.add("Hi");
        strList.add("Hello");
        strList.add("Hola");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        String[] stArr = {"Hi", "Hello", "Hola"};
        Integer[] inArr = {1, 8, 3, 4};

        ArraylengthEquality<String, Integer> o1 = new ArraylengthEquality<>();
        System.out.println(o1.lengthTester(stArr, inArr));
        Arrays.sort(inArr);
        System.out.println(Arrays.toString(inArr));

    }
}
