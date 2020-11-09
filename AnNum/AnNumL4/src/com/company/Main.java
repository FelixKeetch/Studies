package com.company;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        /*Zadanie 3*/
        //        exerciseThree(0.0,1.0,5);
        //        exerciseThree(0.0,1.0,100);

        /*Zadanie 4*/
//        exerciseFour(-1.0, 0.0, pow(10, -5));
//        System.out.println("*********************************");
//        exerciseFour(0.0, 1.0, pow(10, -5));


        /*Zadanie 6*/
        // 1/sqrt(100) == 1/10; (x0)^2 belongs to (1/300, 5/300)
//        exerciseSix(2.0/17, 100, 0, -10);
//        exerciseSixb(2.0/17, 100, -10);
//        exerciseSixb(0.2, 100, -10);

    }

    static void exerciseThree(double a, double b, int n){
        while(n > 0){
            double m = (a + b)/2.0;
            System.out.println("a : " + a + " | m : " + m + " | b : " + b);
            if(f(m) < 0)
                a = m;
            else if(f(m) > 0)
                b = m;
            else {
                System.out.println("n = "+ (100-n) + " | alpha : " + m);
                break;
            }
            n--;
        }
    }
    static void exerciseFour(double a, double b, double prec){
        if(f2(a) > f2(b)){
            exerciseFour(b, a, prec);
            return;
        }
        double mn = 0;
        do{
            mn = (a + b)/2.0;
            System.out.println("a : " + a + " | mn : " + mn + " | b : " + b);

            if(f2(mn) < 0) {
                a = mn;
            }
            else {
                b = mn;
            }
        }while(abs(b - a) > prec);
    }
    static void exerciseSix(double x, double a, int n, double eps){
        if(abs(x - (1 / sqrt(a))) < pow(10, eps))
            System.out.println("x" + n + ":  1 / sqrt(a) : " + x);
        else
            exerciseSix( ((x/2) * (3 - a * x * x)), a, n+1, eps);
    }
    static void exerciseSixb(double x, double a, double eps){
        int n = 0;
        while(abs(x - (1 / sqrt(a))) > pow(10, eps)){
            x =  ((x/2) * (3 - a * x * x));
            n++;
        }
        System.out.println("x" + n + ":  1 / sqrt(a) : " + x);
    }

    static double f(double x){
        return x - 0.49;
    }
    static double f2(double x){
        return x*x - 2*cos(3*x + 1);
    }
}
