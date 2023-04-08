package com.example.numberprob.com.example.zerowithone;

public class ZeroWithOne {
    public static int zeroWithOne( int n ){
        int a = 0;
        int d = 0;
        while ( n>0 ){
            d = n%10;
            if(d == 0){
                d=1;
            }
            a = a*10 + d;
            n=n/10;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(zeroWithOne(2002));
    }
}
