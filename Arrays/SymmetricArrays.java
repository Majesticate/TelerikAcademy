package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SymmetricArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int firstHalfOfNumber = 0;
            int secondHalfOfNumber = 0;
            int[] arrayInt = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (arrayInt.length == 1){
                System.out.println("Yes");
                continue;
            }
            for (int j = 0; j < arrayInt.length / 2; j++) {
                firstHalfOfNumber += arrayInt[j];
            }

            if (arrayInt.length % 2 == 0){
                for (int j = arrayInt.length / 2; j < arrayInt.length; j++) {
                    secondHalfOfNumber += arrayInt[j];
                }
            }else {
                for (int j = arrayInt.length / 2+1; j < arrayInt.length; j++) {
                    secondHalfOfNumber += arrayInt[j];
                }
            }

            if (firstHalfOfNumber == secondHalfOfNumber){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
