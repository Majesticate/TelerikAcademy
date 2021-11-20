package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Move {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startPosition = Integer.parseInt(scanner.nextLine());

        int[] numbers = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        int forwardPoints = 0;
        int backwardPoints = 0;

        while (!input.equals("exit")) {
            String[] inputInArray = input.split(" ");
            int moveTimes = Integer.parseInt(inputInArray[0]);
            String command = inputInArray[1];
            int size = Integer.parseInt(inputInArray[2]);

            int numbersLength = numbers.length;

            switch (command) {
                case "forward":
                    for (int i = 0; i < moveTimes; i++) {
                        int nextStepIs = startPosition + size;
                        // if nextStep is more than array size.
                        if (nextStepIs >= numbersLength) {
                            while (nextStepIs >= numbersLength){
                                nextStepIs = nextStepIs - numbersLength;
                            }
                        }
                        forwardPoints += numbers[nextStepIs];
                        startPosition = nextStepIs;
                    }

                    break;
                case "backwards":
                    for (int i = 0; i < moveTimes; i++) {
                        int nextStepIs = startPosition - size;
                        // if nextStep is below 0.
                        if (nextStepIs < 0) {
                            while (nextStepIs < 0) {
                                int howMuchStepsGoBack = Math.abs(nextStepIs);
                                nextStepIs = numbersLength - howMuchStepsGoBack;
                            }
                        }
                        backwardPoints += numbers[nextStepIs];
                        startPosition = nextStepIs;
                    }

                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("Forward: " + forwardPoints);
        System.out.println("Backwards: " + backwardPoints);
    }
}
