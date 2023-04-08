package com.example.numberprob.com.example.checkprime;

public class CheckPrime {
    public static boolean isPrime( int N ){
        for(int i=2; i<Math.sqrt(N); i++){
            if( N % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        n=17;
        boolean ans = isPrime(n);

        if(ans){
            System.out.println("Number is prime..!");
        }else {
            System.out.println("Number is not prime..!");
        }

    }
}
