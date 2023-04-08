package com.example.numberprob.com.example.factorial;

public class Factorial {
    public static int findFactorial( int n ){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int ans = findFactorial(3);
        System.out.println(ans);
    }
}
