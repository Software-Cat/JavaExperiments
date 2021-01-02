/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Arrays;
import java.util.Scanner;

public final class Main {

    private Main() {

    }

    private static int countOccurrence(int[] numbers, int value) {
        int count = 0;

        for (int number : numbers) {
            if (number == value) {
                count++;
            }
        }

        return count;
    }

    private static int[] countOccurrences(int[] first, int[] second) {
        int[] counts = new int[first.length];

        for (int i = 0; i < first.length; i++) {
            counts[i] = countOccurrence(second, first[i]);
        }

        return counts;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final int[] second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final String result = Arrays.toString(countOccurrences(first, second))
                .replace(", ", " ")
                .replace("[", "")
                .replace("]", "");
        System.out.println(result);
    }
}