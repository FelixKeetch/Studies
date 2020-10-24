package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        ulamSpiral(Integer.parseInt(args[0]));
    }

    public static enum Direction{
        RIGHT, UP, LEFT, DOWN;
        private static Direction[] vals = values();
        //Get the next enum. E.g : RIGHT.next == UP
        public Direction next(){
            return vals[(this.ordinal() + 1) % vals.length];
        }
    }

    public static boolean isPrime(int n){
        if(n == 2)
            return true;
        if(n % 2 == 0 || n < 2)
            return false;
        for(int i = 3; i*i <= n; i+=2)
            if(n%i == 0)
                return false;
        return true;
    }
    public static int[][] removeNotPrime(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++)
                if(!(isPrime(array[i][j])))
                    array[i][j] = 0;
        }
        return array;
    }

    public static void ulamSpiral(int n){
        if(n < 2 || n > 200)
            throw new IllegalArgumentException("The number is not in the range 2-200.");

        int[][] array = new int[n][n];

        //System.out.println(beautifyTwoDArr(array));
        //the coordinates of '1' are [n/2] [(n-1)/2]
        int x = n/2;
        int y = (n-1)/2;

        /*The spiral is drawn in the following pattern:
         * one step right, one up,
         * (first) two steps left,
         * (second) two steps down,
         * (first) three steps right,
         * (second)three steps up and so on.
         * dircounter is responsible for information about whether the
         * step counter is first or second (first == false).
         *
         * stepCounter is reponsible for the number of steps
         * */

        boolean dirCounter = false;
        int stepCounter = 1;
        Direction dir = Direction.RIGHT;

        for (int i = 1; i <= n*n;){
            for(int j = 0; j < stepCounter && i <= n*n; j++,i++){
                array[x][y] = i;
                switch (dir){
                    case RIGHT:{
                        y++;
                        break; }
                    case UP:{
                        x--;
                        break; }
                    case LEFT:{
                        y--;
                        break;
                    }
                    case DOWN:{
                        x++;
                        break;
                    }
                }
            }

            //The change of direction
            dir = dir.next();
            //Checking whether it's the first or the second
            if(dirCounter)
                stepCounter++;

            dirCounter = !dirCounter;
        }
        printMatrix(array);
        printMatrix(removeNotPrime(array));
        printMatrix(primeMatrixToZeroOne(array));
        printAsterixMatrix(array);
    }

    //from StackOverflow. printf("%4d") helps adjust the pattern.

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%6d", matrix[row][col]);
            }
            System.out.println();
        }
        System.out.println("");
    }
    public static int[][] primeMatrixToZeroOne(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (matrix[row][col] == 0)? 0 : 1;
            }
        }
        return matrix;
    }

    private static void printAsterixMatrix(int[][] matrix) {
        System.out.println(" " +
                Arrays.deepToString(matrix)
                        .replace("1", "*")
                        .replace("0", " ")
                        .replace("[", "")
                        .replace(",", "")
                        .replace("]" , "\n")
        );
    }
}
