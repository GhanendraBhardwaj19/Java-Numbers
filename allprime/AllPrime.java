package com.example.numberprob.com.example.allprime;

import java.util.Scanner;

public class AllPrime {
    public static boolean isPrime( int x ){
        for(int i =2; i<=x/2; i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Min: ");
        int min = sc.nextInt();

        System.out.println("Max: ");
        int max = sc.nextInt();

        for(int j = min; j<=max; j++){
            if(isPrime(j)){
                System.out.println(j + " ");
            }
        }
    }
}
