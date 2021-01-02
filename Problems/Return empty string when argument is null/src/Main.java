/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

    /* Correct this method */
    public static String toUpperCase(String str) {
        return str != null ? str.toUpperCase(Locale.ENGLISH) : "";
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = "none".equalsIgnoreCase(line) ? null : line;
        System.out.println(toUpperCase(line));
    }
}