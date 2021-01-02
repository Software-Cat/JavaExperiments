/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder sb = new StringBuilder();

        for (String s : strings) {
            sb.append(s.replaceAll("1", "")
                    .replaceAll("2", "")
                    .replaceAll("3", "")
                    .replaceAll("4", "")
                    .replaceAll("5", "")
                    .replaceAll("6", "")
                    .replaceAll("7", "")
                    .replaceAll("8", "")
                    .replaceAll("9", "")
                    .replaceAll("0", "")
            );
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}