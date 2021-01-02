/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Write a method here
    private static int[] getFirstAndLast(int[] array) {
        return new int[]{
                array[0],
                array[array.length - 1]
        };
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}