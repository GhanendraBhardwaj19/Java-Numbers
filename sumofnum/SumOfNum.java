package com.example.numberprob.com.example.sumofnum;

public class SumOfNum {
    public static int sumOfNaturalNumber( int x ){
        int sum = 0;
        for( int i=1; i<=x; i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int N;
        N = 6;
       int ans = sumOfNaturalNumber(N);
        System.out.println("The sum of "+N+" natural number is: "+ans);
    }
}
