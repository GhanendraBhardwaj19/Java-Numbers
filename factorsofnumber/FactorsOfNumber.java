package com.example.numberprob.com.example.factorsofnumber;

public class FactorsOfNumber {
    public static void factorsOfNumber( int n ){
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        factorsOfNumber( 9 );
    }
}
