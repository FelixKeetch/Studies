package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*Exercise 1*/
//        System.out.printf("The result : %f\n", exerciseOne(0.001));
        //The result : -4039999999999999000000000000000000000.000000
        //The expected result : apprx. TODO
        /*Exercise 2*/
//        for(int i = 11; i < 21; i++){
//            System.out.printf("i = %d, single f(10^-i) = %.14f , double f(10^-i) = %.14f \n",
//                    i, exerciseTwoSingle(i), exerciseTwoDouble(i));
//        }
        /*Exercise 3*/
//        exerciseThree();

        /*Exercise 4*/
        //exerciseFour();

        /*Exercise 5*/
        exerciseFive();
    }
    public static double exerciseOne(double x){
        System.out.printf("Math.pow(x,11) %.16f\n", Math.pow(x, 11));
        return 4040*(
                (Math.sqrt(Math.pow(x, 11) + 1) - 1)
                        /
                Math.pow(x, 11));
    }
    public static float exerciseTwoSingle(float x){
        return (float) (12120 *
                ((x - Math.sin(x))
                        /
                  Math.pow(x,3)));
    }
    public static double exerciseTwoDouble(double x){
        return (12120 *
                ((x - Math.sin(x))
                        /
                  Math.pow(x,3)));
    }
    public static void exerciseThree(){
        double[] y = new double[51];
        y[0] = 1;
        for(int i = 1; i < 51; i++){
          y[i] = -(1.0/7.0) * y[i-1];
          System.out.printf("y[%d] = %.16f \n", i, y[i]);
        }
    }
    public static void exerciseFour(){
        double[] I = new double[21];
        double d = 2021.0 / 2020.0;
        I[0] = Math.log(d);
        System.out.printf("I[0] = %.16f" , I[0]);
        for (int n = 1; n < 21; n++){
            I[n] = 1/n - 2020*(I[n-1]);
            System.out.printf("I[%d] = %.16f \n", n, I[n]);

        }


    }
    public static void exerciseFive(){
        double pi = 3.1415;
        double sum = 0.0;
        int k = 0;
        while(Math.abs(pi - sum) > 0.0001){
            sum+= 4.0 * Math.pow(-1, k) / (2*k + 1);
            k++;
        }
        System.out.println(k);
    }

    /* atan(1) = pi/4
    *  (x < 0) atan(x) = -1/2 * pi - atan(1/x)
    *  (x > 0) atan(x) = 1/2 * pi - atan(1/x)
    *
    * */
    public static double atanForXLessThanOne(double x){
        return null;
    }
    public static double atanForXGreaterThanOne(double x){
        if(x < 0){
            return (- 2.0 * atanForXLessThanOne(1) - atanForXLessThanOne(1/x));
        }
        else{
            return (2 * atanForXLessThanOne(1) - atanForXLessThanOne(1/x));
        }
    }


}
