package com.company;
import java.util.stream.LongStream;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        /*Zadanie 7*/
//        a(10.0);
//        a(100.0);
//        a(1000.0);
//        a(10000.0);
//        a(100000.0);

//        b(0.1);
//        b(0.001);
//        b(0.00001);
//        b(0.000000001);

       c(pow(5,6) - 1);
       c(pow(5,6) - 0.1);
       c(pow(5,6) - 0.00001);
       c(pow(5,6) - 0.00000000001);


        /*Zadanie 8 */
//        exerciseOne(0.1);
//        exerciseOne(0.01);
//        exerciseOne(0.001);
//        exerciseOne(0.00001);
//        exerciseOne(0.000000001);

    }
    static void a(double x){
        System.out.printf("pow(x,3) - sqrt( pow(x, 6) + 2020)        : %.16f \n",
                pow(x,3) - sqrt(pow(x, 6) + 2020));

        System.out.printf("2020 / pow(x,3) + sqrt( pow(x, 6) + 2020) : %.16f \n\n",
                2020.0 / (pow(x,3) + sqrt( pow(x, 6) + 2020.0)));
    }

    static void b(double x){
        System.out.printf("(x^-4)*(cos x - 1 + x^2/2) : %.16f\n", pow(x, -4)*(cos(x) - 1 + (pow(x, 2)/2) ));
        //cos(x) = 1 - x^2/2! +
        System.out.printf("1/4! - x^2/6! + x^4/8!...  : %.16f\n\n",
                        (    1.0  /fact(4)
                        - pow(x,2)/fact(6)
                        + pow(x,4)/fact(8)
                        - pow(x,6)/fact(10)
                        + pow(x, 8)/fact(12)));
    }
    static void c(double x){
        System.out.printf("log(5,x) - 6    : %.16f\n", cLog(5,x) - 6);
        System.out.printf("log(5, x / 5^6) : %.16f\n\n", cLog(5,(x/pow(5,6))));

    }

    public static long fact(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }
    private static double cLog(double base, double logNumber) {
        return Math.log(logNumber) / Math.log(base);
    }

    public static void exerciseOne(double x){
        System.out.printf("4040* ((Math.sqrt(Math.pow(x, 11) + 1) - 1) / Math.pow(x, 11)) : %.16f\n", 4040*(
                (Math.sqrt(Math.pow(x, 11) + 1) - 1)
                        /
                        Math.pow(x, 11)));
        System.out.printf("4040 * 1 / (sqrt(pow(x, 11) + 1) + 1) : %.16f \n \n", 4040 * 1 / (sqrt(pow(x, 11) + 1) + 1));

    }

}
