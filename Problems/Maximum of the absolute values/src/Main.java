/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * Returns the largest absolute value in the array of numbers.
     *
     * @param numbers the input array of String integer numbers
     * @return the maximum integer absolute value in the array
     */
    public static int maxAbsValue(String[] numbers) {
        return Arrays.stream(numbers).map(Integer::parseInt).reduce(Integer.MIN_VALUE, (int1, int2) -> {
            if (Math.abs(int2) > int1) {
                return Math.abs(int2);
            } else {
                return Math.abs(int1);
            }
        });
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(maxAbsValue(scanner.nextLine().split("\\s+")));
    }
}