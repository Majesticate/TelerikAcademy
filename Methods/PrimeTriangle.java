package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= i ; j++) {
                if (IsPrimeCurrentNumber(j) || j ==1){
                    list.add(1);
                }else {
                    list.add(0);
                }
            }
            if (list.get(i -1) == 1){
                for (Integer integer : list) {
                    System.out.print(integer + " ");
                }
                System.out.printf("%n");
            }

        }

    }

    private static boolean IsPrimeCurrentNumber(int number) {
        boolean isPrime = false;
        int i = 0;
        int m = 0;
        int flag = 0;
        m = number / 2;
        if (number == 0 || number == 1) {
            isPrime = false;
        } else {
            for (i = 2; i <= m; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                isPrime = true;
            }
        }
        return isPrime;
    }
}
