/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;

class StreamUtils {

    public static Stream<Integer> generateStreamWithPowersOfTwo(int n) {
        return Stream.generate(new Supplier<Integer>() {
            double exponent = 0;

            @Override
            public Integer get() {
                return (int) Math.pow(2, exponent++);
            }
        }).limit(n);
    }
}