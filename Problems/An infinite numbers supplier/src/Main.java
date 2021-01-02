/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.function.*;

class FunctionUtils {

    public static Supplier<Integer> getInfiniteRange() {
        return new Supplier<>() {
            private int count = 0;

            @Override
            public Integer get() {
                return count++;
            }
        };
    }

}