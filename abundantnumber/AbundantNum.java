package com.example.numberprob.com.example.abundantnumber;

public class AbundantNum {
    public static int sumOfDigit( int x ){
        int sum = 0;
        for( int i=1; i<=x/2; i++){
            if( x%i == 0){
                sum +=i;
            }
        }
        return sum;
    }

    public static boolean isAbundant( int n ){
        int s = sumOfDigit( n );
        if( s>n ){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean ans = isAbundant(18);
        if(ans){
            System.out.println("Yes,It is abundant number.");
        } else {
            System.out.println("No,It is not abundant number.");
        }
    }
}
