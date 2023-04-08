package com.example.numberprob.com.example.sumofgpseries;
import java.util.*;
public class SumOfGPSeries {
    public static double sumOfGPSeries( int a ,int r, int n ){
        double firstPart = ( Math.pow(r,n) - 1 );
        int secondPart = ( r - 1 );
        double sum = (a*firstPart/secondPart);
        return sum;
    }
    public static void main(String[] args) {
        double ans =  sumOfGPSeries(3,5,2);
        System.out.println("The sum of GP Series is: "+ans);
    }
}
