package com.example.numberprob.com.example.quardiceqn;

public class QuardicEqn {
    public static void quardicEQN( int a, int b, int c){
        double root1,root2;
        int D = ((b*b) - (4*a*c));
        double sqrt_value = Math.sqrt(Math.abs(D));
        if (D>0){
            System.out.println("Roots are real and different..!");
             root1 = (double)(-b - sqrt_value)/2*a;
             root2 = (double)(-b + sqrt_value)/2*a;
            System.out.println(root1 + "\n" + root2);
        }
        else if (D == 0){
            System.out.println("Roots are real and same..!");
            root1 = (double)(-b/2*a);
            root2 = (double)(-b/2*a);
            System.out.println(root1 + "\n" + root2);
        }
        else{
            System.out.println("Roots are complex..!");
            System.out.println(-(double)b/(2*a)+ "+i"+sqrt_value +"\n" + -(double)b/(2*a)+ "-i"+sqrt_value);
        }
    }
    public static void main(String[] args) {
        quardicEQN(1,-3,-10);
    }
}
