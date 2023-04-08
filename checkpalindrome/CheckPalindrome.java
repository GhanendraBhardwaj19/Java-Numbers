package com.example.numberprob.com.example.checkpalindrome;

public class CheckPalindrome {
    public static int reverse(int n){
        int a=0;
        while(n > 0){
            int r = n % 10;
            a = 10*a +r;
            n = n / 10;
        }
        return a;
    }
    public static void main(String[] args) {
        int n = 121;
        int dummy = n;
        int y = reverse(n);
        if(dummy ==  y){
            System.out.println("Number is Palindrome!");
        } else {
            System.out.println("Number is not Palindrome!");
        }

    }
}
