package com.example.numberprob.com.example.reversenumber;

public class ReverseNumber {
    public static int reverseNumber( int N ){
        int a =0;
        while ( N>0 ){
            int r = N%10;
            a = a*10 + r;
            N = N/10;
        }
        return a;
    }
    public static void main(String[] args) {
        int number = reverseNumber( 254);
        System.out.println(number);
    }
}
