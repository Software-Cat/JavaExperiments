/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

// do not remove imports

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    public static <E> boolean hasNull(E[] array) {
        for (E e : array) {
            if (e == null) {
                return true;
            }
        }
        return false;
    }
}