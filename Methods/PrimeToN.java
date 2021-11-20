package com.company;

import java.util.Scanner;

public class PrimeToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n >= 1 && n <= 1024)
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2 || i == 3 || i == 5 || i == 7){
                System.out.print(i+" ");
            }else if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 ){
                System.out.print(i+" ");
            }
        }
    }
}
