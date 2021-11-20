package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ThreeGroups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();
        ArrayList<Integer> thirdList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0){
                thirdList.add(numbers[i]);
            }else if (numbers[i] % 2 == 0){
                secondList.add(numbers[i]);
            }else {
                firstList.add(numbers[i]);
            }
        }

        PrintLists(thirdList);
        PrintLists(secondList);
        PrintLists(firstList);

    }

    private static void PrintLists(ArrayList<Integer> thirdList) {
        if (!thirdList.isEmpty()){
            for (Integer integer : thirdList) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
