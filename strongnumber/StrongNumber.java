package com.example.numberprob.com.example.strongnumber;

public class StrongNumber {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int strongNumber( int x ){
        int sum = 0;
        while(x>0){
            int r = x%10;
            sum = sum +factorial(r);
            x=x/10;
        }
        return sum;
    }
    public static boolean isStrongNumber( int m ){
        int res = strongNumber(m);
        if( res == m ){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean ans = isStrongNumber( 145 );
        if(ans){
            System.out.println("The number is strong number!");
        } else {
            System.out.println("The number is not strong number!");
        }
    }
}
