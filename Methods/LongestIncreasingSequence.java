package com.company;

import java.util.*;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        List<Integer> numbers = new ArrayList<>();

        int increase = 1;
        int maxIncreases = 0;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            numbers.add(number);
            if (i == 0){
                continue;
            }
            int numberBeforeCurrentNumber = numbers.get(i -1);
            if (number > numberBeforeCurrentNumber){
                increase++;
            }else {
                if (increase > maxIncreases){
                    maxIncreases = increase;
                }
                increase =1;
            }
        }

        System.out.println(maxIncreases);
    }
}
