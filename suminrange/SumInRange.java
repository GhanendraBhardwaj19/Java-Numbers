package com.example.numberprob.com.example.suminrange;

public class SumInRange {
    public static int sumInRange( int l, int r){
        int sum = 0;
        for( int i=l; i<=r; i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int ans = sumInRange( 2,7 );
        System.out.println(ans);
    }
}
