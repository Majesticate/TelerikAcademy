package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayInt = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] first = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] second = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int repeats;
        int longer;
        boolean firstIsLonger = true;


        if (first.length > second.length){
            repeats = second.length;
            longer = first.length;
        }else {
            repeats = first.length;
            longer = second.length;
            firstIsLonger = false;
        }

        int[] result = new int[longer];

        int oneInMind = 0;

        for (int i = 0; i < repeats; i++) {
            int firstNum = first[i];
            int secondNum = second[i];

            int sumOfTwo = firstNum + secondNum;
            if (oneInMind == 1){
                sumOfTwo += 1;
                oneInMind --;
            }
            if (sumOfTwo >= 10){
                sumOfTwo = sumOfTwo % 10;
                oneInMind++;
            }
            result[i] = sumOfTwo;
        }
        if (firstIsLonger){
            for (int i = repeats; i < longer; i++) {
                result[i] = first[i];
            }
        }else {
            for (int i = repeats; i < longer; i++) {
                result[i] = second[i];
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
