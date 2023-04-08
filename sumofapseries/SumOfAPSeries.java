package com.example.numberprob.com.example.sumofapseries;

public class SumOfAPSeries {
    public static int sumOfAPSeries( int n,int a, int d ){
        int sum = 0;
        for( int i = 1; i <= n; i++ ){
            sum = sum + a;
            a = a + d;
        }
        return sum;

    }
    public static void main(String[] args) {
        int ans = sumOfAPSeries(4,2,2);
        System.out.println("The sum of AP Series is: "+ ans);
    }
}
