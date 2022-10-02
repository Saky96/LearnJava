package com.demo.overloading;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Point {
    double x;
    double y;

    public Point(){
        this.x = 0d;
        this.y = 0d;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double display(){
        double sq1 = (0 - this.x) * (0 - this.x);
        double sq2 = (0 - this.y) * (0 - this.y);

//        return (double) Math.round((Math.sqrt(sq1 + sq2)) * 10000d)/10000; //For 4 decimal places
        return Math.sqrt(sq1 + sq2); //For 4 decimal places
    }

    public double display(Point p){
        double sq1 = (p.x - this.x) * (p.x - this.x);
        double sq2 = (p.y - this.y) * (p.y - this.y);

//        return (double) Math.round((Math.sqrt(sq1 + sq2)) * 10000d)/10000;
        return Math.sqrt(sq1 + sq2);
    }
}

class Tester{
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 6);
        Point p3 = new Point();
        DecimalFormat df = new DecimalFormat("#.####"); //For 4 decimal places
//        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println(df.format(p1.display()));
        System.out.println(df.format(p1.display(p2)));
        System.out.println(df.format(p1.display(p3)));
    }
}
