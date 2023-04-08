package com.example.numberprob.com.example.positiveornegative;

public class PositiveOrNegative {
    public static void isPositiveOrNegative( int n ){
        if(n<0){
            System.out.println("Number is Negative..!");
        } else {
            System.out.println("Number is positive..!");
        }
    }
    public static void main(String[] args) {
        isPositiveOrNegative(2);
    }
}
