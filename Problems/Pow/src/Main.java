/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double alpha = scanner.nextDouble();
        double beta = scanner.nextDouble();

        System.out.println(StrictMath.pow(alpha, beta));
    }
}