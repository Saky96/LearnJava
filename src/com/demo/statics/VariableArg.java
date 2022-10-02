package com.demo.statics;

public class VariableArg {
    public void display(int ...numbers){
        for(int num : numbers){
            System.out.println(num);
        }
    }
}

class Test{
    public static void main(String[] args) {
        VariableArg arg = new VariableArg();
        arg.display(1, 2, 3, 4, 5);
        System.out.println(arg);
    }
}
