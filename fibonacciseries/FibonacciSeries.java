package com.example.numberprob.com.example.fibonacciseries;

public class FibonacciSeries {
//    0 1 2 3 5 8
    public static void printFibonacci( int n ){
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.println(a+" "+b);
        for(int i=0;  i<=n; i++){
            sum = a+b;
            System.out.print(sum+" ");
             a = b;
             b = sum;
        }
    }
    public static void main(String[] args) {
        printFibonacci(5);
    }
}
