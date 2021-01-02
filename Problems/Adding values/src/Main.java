/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private Main() {
    }

    // Write a method here
    private static void addValueByIndex(long[] array, int index, long value) {
        array[index] += value;
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        int index = scanner.nextInt();
        long value = scanner.nextLong();
        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}