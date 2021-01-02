/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Scanner;

class Main {

    private static final double GRAVITY = 9.8;

    private Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;

        double density = scanner.nextDouble();
        double height = scanner.nextDouble();

        double pressure = density * height * GRAVITY;

        System.out.println(pressure);
    }
}