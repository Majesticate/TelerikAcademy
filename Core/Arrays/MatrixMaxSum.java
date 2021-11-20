package com.company;

import java.util.*;

public class MatrixMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[number][];

        for (int i = 0; i < matrix.length; i++) {
            int[] arrayInt = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int length = arrayInt.length;
            matrix[i] = new int[length];
            for (int j = 0; j < arrayInt.length ; j++) {
                matrix[i][j] = arrayInt[j];
            }
        }

        int finalCount = 0;

        List<Integer> list = new ArrayList<>();

        int[] coordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < coordinates.length; i +=2) {
            // first number
            int firstCoordinate = coordinates[i];
            // second number
            int secondCoordinate = coordinates[i+1];

            if ( firstCoordinate >=1 && secondCoordinate >=1){
                finalCount = ThisIsOnlyPositive(matrix, finalCount, firstCoordinate, secondCoordinate);

            }else if ( firstCoordinate < 0 && secondCoordinate >=1){
                finalCount = ThisIsNegativeAndPositive(matrix, finalCount, matrix[i], firstCoordinate, secondCoordinate);

            }else if (firstCoordinate >= 1 && secondCoordinate < 0){
                finalCount = ThisIsPositiveAndNegative(matrix, finalCount, matrix[i], firstCoordinate, secondCoordinate);

            }else if (firstCoordinate < 0 && secondCoordinate < 0){
                finalCount = ThisIsOnlyNegatives(matrix, finalCount, matrix[i], firstCoordinate, secondCoordinate);

            }
            list.add(finalCount);

        }
        int max = Collections.max(list);
        System.out.println(max);

    }

    private static int ThisIsOnlyNegatives(int[][] matrix, int finalCount, int[] matrix1, int firstCoordinate, int secondCoordinate) {
        int countNumbers = 0;
        boolean isLast = false;


        int positiveFirst = Math.abs(firstCoordinate);
        int positiveSecond = Math.abs(secondCoordinate);

        for (int row = positiveFirst -1; row < matrix.length ; row++) {
            for (int collum = matrix1.length -1; collum >= positiveSecond-1; collum--) {
                if (isLast) {
                    countNumbers += matrix[row][positiveSecond-1];
                    break;
                } else {
                    countNumbers += matrix[row][collum];
                }
            }
            isLast = true;
        }
        finalCount = countNumbers;
        return finalCount;
    }

    private static int ThisIsPositiveAndNegative(int[][] matrix, int finalCount, int[] matrix1, int firstCoordinate, int secondCoordinate) {
        int countNumbers = 0;
        boolean isLast = false;

        int positiveFirst = Math.abs(secondCoordinate);

        for (int row = firstCoordinate -1; row < matrix.length ; row++) {
            for (int collum = 0 ; collum < positiveFirst; collum++) {
                if (isLast) {
                    countNumbers += matrix[row][positiveFirst -1];
                    break;
                } else {
                    countNumbers += matrix[row][collum];
                }
            }
            isLast = true;
        }
        finalCount = countNumbers;
        return finalCount;
    }

    private static int ThisIsNegativeAndPositive(int[][] matrix, int finalCount, int[] matrix1, int firstCoordinate, int secondCoordinate) {
        int countNumbers = 0;
        boolean isLast = false;

        int positiveFirst = Math.abs(firstCoordinate);
        for (int row = positiveFirst -1; row >=0 ; row--) {
            for (int collum = matrix1.length -1; collum >= secondCoordinate-1  ; collum--) {
                if (isLast){
                    countNumbers += matrix[row][secondCoordinate-1];
                    break;
                }else {
                    countNumbers += matrix[row][collum];
                }
            }
            isLast = true;
        }
        finalCount = countNumbers;
        return finalCount;
    }

    private static int ThisIsOnlyPositive(int[][] matrix, int finalCount, int firstCoordinate, int secondCoordinate) {
        int countNumbers = 0;
        boolean isLast = false;
        for (int row = firstCoordinate -1; row >= 0 ; row--) {
            for (int collum = 0; collum < secondCoordinate; collum++) {
                if (isLast){
                    countNumbers += matrix[row][secondCoordinate -1];
                    break;
                }else {
                    countNumbers += matrix[row][collum];
                }
            }
            isLast = true;
        }
        finalCount = countNumbers;
        return finalCount;
    }
}
