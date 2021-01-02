/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class Predicate {

    public static final TernaryIntPredicate allValuesAreDifferentPredicate = (a, b, c) -> a != b && b != c && a != c;

    @FunctionalInterface
    public interface TernaryIntPredicate {

        boolean test(int a, int b, int c);
    }

}