package com.example.numberprob.com.example.allpalindrome;

import java.util.Scanner;

public class AllPalindrome {

    public static int reverse( int n){
        int a = 0;
        while (n>0){
            int r = n%10;
            a = a*10+r;
            n = n/10;
        }
        return a;
    }
    public static boolean isPlindrome(int x){
        int dummy = reverse(x);
        if( x== dummy ){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Min: ");
        int min = sc.nextInt();
        System.out.println("Max: ");
        int max = sc.nextInt();


        for(int i = min; i<=max; i++){
            if(isPlindrome(i)){
                System.out.println(i + " ");
            }
        }
    }
}
