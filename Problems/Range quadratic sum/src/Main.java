/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.stream.*;

class QuadraticSum {

    public static long rangeQuadraticSum(int fromIncl, int toExcl) {
        return LongStream.range(fromIncl, toExcl)
                .map(x -> x * x)
                .sum();
    }
}