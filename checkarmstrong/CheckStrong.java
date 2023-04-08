package com.example.numberprob.com.example.checkarmstrong;
import java.util.*;
public class CheckStrong {
    public static int isArmstrong(int x){
        int a = 0;
        while (x>0){
            int r = x%10;
            a = a + r*r*r;
            x = x/10;
        }
        return a;
    }
    public static void main(String[] args) {
        int N = 153;
        int dummy = isArmstrong( N );
        if(dummy == N){
            System.out.println("Yes,Number is Armstrong..!");
        } else {
            System.out.println("No,Number is not Armstrong..!");
        }
    }
}
