package com.example.numberprob.com.example.automorphicnum;

public class AutomorphicNum {
    public static boolean isAutomorphic( int n ){
        int sqrt = n*n;
        while(n>0){
            if(n%10!=sqrt%10){
                return false;
            }
            n/=10;
            sqrt/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean ans = isAutomorphic(76);
        if(ans){
            System.out.println("Yes,It is an automorphic number.");
        } else {
            System.out.println("No,It is not an automorphic number.");
        }
    }
}
