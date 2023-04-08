package com.example.numberprob.com.example.minandmax;
import java.util.*;
public class MinAndMax {
    public static void minAndMax( int x ){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while( x>0 ){
           int digit = x%10;
           if(digit < min ){
               min = digit;
           }
           if(digit > max){
               max = digit;
           }
            x=x/10;
        }

        System.out.println("The min value is: "+min+" And the max value is: "+max);
    }
    public static void main(String[] args) {
        minAndMax(23004 );
    }
}
