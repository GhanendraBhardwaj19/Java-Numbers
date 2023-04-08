package com.example.numberprob.com.example.evenorodd;

public class EvenOrOdd {
    public static void isEvenOrOdd( int n ){
        if( n%2 == 0){
            System.out.println("Number is Even..!");
        } else {
            System.out.println("Number is Odd..!");
        }
    }
    public static void main(String[] args) {
        int x;
        x=200;
        isEvenOrOdd(x);
    }
}
