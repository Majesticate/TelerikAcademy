package com.company;

import java.util.Scanner;

public class LongestSequenceOfEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arrayInt = new int[n];

        int count = 1;

        int lastCount = 1;

        for (int i = 0; i < n; i++) {

            int number = Integer.parseInt(scanner.nextLine());
            arrayInt[i] = number;
            if (i == 0 ){
                continue;
            }
            int previousNumber = arrayInt[i -1];
            if (previousNumber == number){
                count++;
            }else {
                if (count > lastCount){
                    lastCount = count;
                }
                count = 1;
            }


        }
        System.out.println(lastCount);
    }
}
