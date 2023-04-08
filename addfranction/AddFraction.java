package com.example.numberprob.com.example.addfranction;

public class AddFraction {
    public static void addFraction( int num1, int num2, int den1, int den2 ){
        int res1 = den1*num2;
        int res2 = den2*num1;
        int res3 = den1*den2;
        int num3  = res1+res2;

        System.out.println(num3 + "/" + res3);
    }
    public static void main(String[] args) {
        addFraction(5,1,2,2);
    }
}
