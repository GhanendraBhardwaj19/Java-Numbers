package com.example.numberprob.com.example.harshadnum;

public class HarshadNum {

    public static int sumOfDigit( int x ){
        int sum = 0;
        while( x>0 ){
            int r = x%10;
            sum +=r;
            x = x/10;
        }
        return sum;
    }

    public static boolean isHarshad( int n ){
        int s = sumOfDigit(n);
        if( n%s == 0 ){
            return true;
        }
       return false;
    }
    public static void main(String[] args) {
        int n = 378;
        boolean ans = isHarshad( n );
        if(ans){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
