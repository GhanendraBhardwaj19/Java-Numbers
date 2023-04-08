package com.example.numberprob.com.example.perfectnumber;

public class PerfectNumber {
    public static boolean isPerfect( int x ){
        int digit = x;
        int sum = 0;
        for( int i=1; i<=x/2; i++ ){
             if(digit%i == 0){
                 sum+=i;
             }
        }
        if( sum == x ){
            return  true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n;
        n = 28;
        boolean ans = isPerfect( n );

        if( ans ){
            System.out.println("Yes,Number is Perfect..!");
        } else {
            System.out.println("No,Number is not Perfect..!");
        }
    }
}
