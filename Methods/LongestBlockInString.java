package com.company;

import java.util.Scanner;

public class LongestBlockInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        String lastLongerCharacter = "";

        for (int i = 0; i < input.length(); i++) {
            char nextChar;
            char currentChar = input.charAt(i);
            if (i != input.length() -1){
                nextChar = input.charAt(i + 1);
            }else {
                nextChar = ' ';
            }

            stringBuilder.append(currentChar);
            if (currentChar == nextChar) {
                continue;
            } else {
                if (lastLongerCharacter.length() == stringBuilder.length()) {
                    if (!lastLongerCharacter.equals("")) {
                        if (Character.isUpperCase(stringBuilder.charAt(0)) && Character.isLowerCase(lastLongerCharacter.charAt(0))) {
                            lastLongerCharacter = stringBuilder.toString();
                        }else if (Character.isLowerCase(stringBuilder.charAt(0)) && Character.isLowerCase(lastLongerCharacter.charAt(0))){
                            lastLongerCharacter = lastLongerCharacter;
                        }
                    } else {
                        lastLongerCharacter = stringBuilder.toString();
                    }
                }else if (lastLongerCharacter.length() < stringBuilder.length()){
                    lastLongerCharacter = stringBuilder.toString();
                }
                stringBuilder = new StringBuilder();
            }

        }
        System.out.println(lastLongerCharacter);
    }
}
