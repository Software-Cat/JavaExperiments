/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Scanner;

public class Main {

    private Main() {
    }

    private static double pow(double a, long n) {
        if (0 == n) {
            return 1;
        } else if (1 == n) {
            return a;
        } else if (0 == n % 2) {
            return StrictMath.pow(StrictMath.pow(a, 2), n / 2.0);
        } else {
            return a * StrictMath.pow(a, n - 1);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double a = Double.parseDouble(scanner.nextLine());
        final int n = Integer.parseInt(scanner.nextLine());
        System.out.println(pow(a, n));
    }
}