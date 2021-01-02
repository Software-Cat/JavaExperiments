/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.math.BigInteger;

class DoubleFactorial {
    private DoubleFactorial() {

    }

    public static BigInteger calcDoubleFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = n; i > 0; i-=2) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}