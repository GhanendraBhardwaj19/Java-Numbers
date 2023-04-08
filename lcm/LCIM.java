package com.example.numberprob.com.example.lcm;

public class LCIM {
    public static int findGCD(int x , int y){
        int ans = 0;
        for(int i=1; i<=Math.min(x,y); i++){
            if( x%i == 0 && y%i == 0){
                ans = i;
            }
        }
        return ans;
    }
    public static int findLCM( int a, int b){
        int gcd = findGCD(a,b);
        int lcm = (a*b)/gcd;
        return lcm;
    }

    public static void main(String[] args) {
        System.out.println(findLCM(3,6));
    }
}
