/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */


class MultipleArgumentsLambda {

    @FunctionalInterface
    interface SeptenaryStringFunction {

        String apply(String a, String b, String c, String d, String e, String f, String g);
    }
}

class Seven {

    public static MultipleArgumentsLambda.SeptenaryStringFunction fun = (a, b, c, d, e, f, g) -> {
        return (a + b + c + d + e + f + g).toUpperCase();
    };
}