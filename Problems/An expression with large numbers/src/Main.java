/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.math.BigInteger;
import java.util.Scanner;

class Main {
    private Main() {

    }

    public static void main(String[] args) {
        BigInteger alpha;
        BigInteger beta;
        BigInteger gamma;
        BigInteger delta;

        try (Scanner scanner = new Scanner(System.in)) {
            alpha = scanner.nextBigInteger();
            beta = scanner.nextBigInteger();
            gamma = scanner.nextBigInteger();
            delta = scanner.nextBigInteger();
        }

        BigInteger result = alpha.negate().multiply(beta).add(gamma).subtract(delta);

        System.out.println(result);
    }
}