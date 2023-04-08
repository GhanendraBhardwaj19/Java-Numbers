package com.example.numberprob.com.exampke.gcd;

public class GCD {
    public static int findGCD( int num1, int num2 ){
        int ans = 1;
        for(int i=1; i<=Math.min(num1,num2); i++){
            if( num1%i == 0 && num2%i == 0 ){
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(findGCD( 3 , 6 ));
    }
}
