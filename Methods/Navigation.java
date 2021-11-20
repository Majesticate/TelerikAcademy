package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Navigation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());


        int[][] matrix = new int[rows][cols];

        int first = 1;

        for (int i = 0; i < cols; i++) {
            for (int j = rows - 1; j >= 0; j--) {
                if (j == rows - 1) {
                    matrix[j][i] = first;
                } else {
                    int lastPosition = j +1;
                    matrix[j][i] = matrix[lastPosition][i] * 2;
                }
            }
            first = first * 2;
        }
    }
}
