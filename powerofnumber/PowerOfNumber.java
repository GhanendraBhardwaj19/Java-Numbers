package com.example.numberprob.com.example.powerofnumber;
import java.util.*;
public class PowerOfNumber {
    public static int powerOfNumber( int n, int k ){
        int x = n;
        for(int i=1; i<k; i++){
            x=x*n;
        }
        return x;
    }
    public static void main(String[] args) {
        int ans = powerOfNumber(2,4);
        System.out.println(ans);
    }
}
