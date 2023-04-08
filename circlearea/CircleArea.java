package com.example.numberprob.com.example.circlearea;

public class CircleArea {
    public static double circleArea( int r ) {
        double pi = 3.14;
        return  pi*(r*r);
    }

    public static void main(String[] args) {
        System.out.println(circleArea(4));
    }
}
