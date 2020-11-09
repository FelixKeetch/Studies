package com.company;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        /*Zadanie 1*/
        //a
//        exerciseOneA(PI/6.0 -              0.00000000000001);
//        exerciseOneA(PI/6.0);
//        exerciseOneAModOne(PI/6.0 -        0.00000000000001);
//        exerciseOneAModOne(PI/6.0);
//        exerciseOneAModTwo(PI/6.0 -        0.00000000000001);
//        exerciseOneAModTwo(PI/6.0);
//        exerciseOneAModThree(PI/6.0,      -0.00000000000001);
//        exerciseOneAModThree(PI/6.0,      -0.00000000000000);
        //b
//           exerciseOneB(0.001);
//        exerciseOneBMod(0.001);
//        System.out.println((0.00000000000003508 - 0.00000000000003464)/0.00000000000003464);

        /*Zadanie 2*/
        findRoots(1,   (int)pow(10, 6), 1);
        findCorrectRoots(1, pow(10, 6), 1);

    }
    static void exerciseOneA(double x){
        System.out.printf("4*cos^2(x) - 3 =                     %.20f\n",
                4*cos(x)*cos(x) - 3);
    }
    static void exerciseOneAModOne(double x){
        System.out.printf("cos(3*x)/cos(x) =                    %.20f\n",
                (cos(3*x) / cos(x)));
    }
    static void exerciseOneAModTwo(double x){
        System.out.printf("-4 * sin(x - PI/6) * sin(x + PI/6) = %.20f\n",
                -4 * sin(x - PI/6.0) * sin(x + PI/6.0));
    }
    static void exerciseOneAModThree(double x, double eps){
        System.out.printf("4*cos^2(x) - 3 =                     %.16f\n",
                (4* (
                        pow(cos(x), 2)
                      - 0.5*sin(2*x)*sin(2*eps)
                      + pow(sin(x),2)*pow(sin(eps),2)
                )
                - 3));
    }
    static void exerciseOneB(double x){
        System.out.printf("(PI/2 - x - arctg(x)) / x^3 =   %.16f\n",
                (PI/2 - x - PI/2 + atan(x)) / pow(x,3));
    }
    static void exerciseOneBMod(double x){
        System.out.printf("-1/3 + x^2/5 - x^4/7 + x^6/9  = %.16f\n",
                -1/3 + pow(x,2)/5 - pow(x,4)/7 + pow(x,6)/9);
    }
    static void findCorrectRoots(double a, double b, double c){
        System.out.println("x1 = " + (-2 * c /(sqrt(b*b-4*a*c) + b)));
        System.out.println("x2 = " + (-2 * c /(b - sqrt(b*b-4*a*c))));

    }
    static void findRoots(double a, double b, double c)
    {
        // If a is 0, then equation is not
        // quadratic, but linear

        if (a == 0) {
            System.out.println("Invalid");
            return;
        }

        double d = b * b - 4 * a * c;
        double sqrt_val = sqrt(abs(d));

        if (d > 0) {
            System.out.println(
                    "Roots are real and different \n");

            System.out.println(
                    (double)(-b + sqrt_val) / (2 * a) + "\n"
                            + (double)(-b - sqrt_val) / (2 * a));
        }
        else if (d == 0) {
            System.out.println(
                    "Roots are real and same \n");

            System.out.println(-(double)b / (2 * a) + "\n"
                    + -(double)b / (2 * a));
        }
        else // d < 0
        {
            System.out.println("Roots are complex \n");

            System.out.println(-(double)b / (2 * a) + " + i"
                    + sqrt_val + "\n"
                    + -(double)b / (2 * a)
                    + " - i" + sqrt_val);
        }
    }



}
