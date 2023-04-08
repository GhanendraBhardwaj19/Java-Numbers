package com.example.numberprob.com.example.leapyear;

public class LeapYear {
    public static boolean isLeapYear( int yr ){
        if(( yr%4==0 && yr%100!=0 ) || ( yr%400 == 0 )){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean ans = isLeapYear(2000);
        if(ans){
            System.out.println("Yes,Year is Leap Year..!");
        } else {
            System.out.println("No,Year is not Leap Year..!");
        }
    }
}
