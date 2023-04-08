package com.example.numberprob.com.example.permutations;

public class Permutations {
    public static int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
    public static int findPermutation( int n, int r){
        int num = factorial(n);
        int den = factorial(n-r);

        int ans = num/den;
        return ans;
    }
    public static void main(String[] args) {
        int res = findPermutation(6,4);
        System.out.println(res);
    }
}
