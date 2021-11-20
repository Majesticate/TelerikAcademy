package com.company;

import java.util.Scanner;

public class AboveTheMainDiagonal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        long[][] matrix = new long[n][n];

        if (n <= 30) {
            FillingTheMatrix(matrix);

            long sumOfDiagonal = 0;

            sumOfDiagonal = mySum(matrix, sumOfDiagonal);

            System.out.println(sumOfDiagonal);
        }
    }

    private static long mySum(long[][] matrix, long sumOfDiagonal) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                sumOfDiagonal += matrix[i][j];
            }
        }
        return sumOfDiagonal;
    }

    private static void FillingTheMatrix(long[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i == 0) {
                matrix[i][0] = 1;
            } else {
                matrix[i][0] = matrix[i - 1][0] * 2;
            }
            for (int j = 1; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j - 1] * 2;
            }
        }
    }
}
