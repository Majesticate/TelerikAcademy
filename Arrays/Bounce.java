package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Bounce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayInt = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        long[][] matrix = new long[arrayInt[0]][arrayInt[1]];

        FillingTheMatrix(matrix);

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                    break;
                }
            }
        }

        int justNeedThis = 0;

        for (int i = arrayInt[0]; i < arrayInt[1]; i++) {
            for (int j = matrix.length - 2; j >= 0; j--) {
                sum+= matrix[j][i];
                justNeedThis =j;
                break;
            }
        }

        int collum = 0;
        int row = 0;

        for (int i = justNeedThis-1; i >= 0 ; i--) {
            for (int j = arrayInt[0]-1; j >= 0; j--) {
                sum += matrix[i][j];
                collum = j;
                row = i;
                break;
            }
            
        }
        for (int i = collum -1; i >= 0; i--) {
            for (int j = row +1; j<= arrayInt[0]; j++) {
                sum += matrix[i][j];
                row++;
                break;
            }
        }

        System.out.println(sum);

        

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
