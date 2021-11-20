package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayInt = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = arrayInt.length-1; i >= 0; i--) {
            if (i != 0){
                System.out.print(arrayInt[i] + ", ");
            }else {
                System.out.print(arrayInt[i]);
            }
        }
    }
}
