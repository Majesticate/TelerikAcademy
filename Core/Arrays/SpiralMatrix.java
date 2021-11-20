package com.company;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        
        int[][] matrix = new int[n][n];

        //4

        //1 2 3 4
        //12 13 14 5
        //11 16 15 6
        //10 9 8 7
        int up = 0;
        int right = 0;
        int down = 0;
        int left = 0;

        int count = 1;

        for (int row = up; row < matrix.length - up; row++) {
            for (int collum = 0; collum < matrix.length; collum++) {
                matrix[row][collum] = count;
                count++;
            }
            up++;
        }

        for (int collum = matrix.length-1 - right; collum > matrix.length; collum--) {
            for (int row = up; row < matrix.length; row++) {
                matrix[row][collum] = count;
                count++;
            }
        }

    }
}
