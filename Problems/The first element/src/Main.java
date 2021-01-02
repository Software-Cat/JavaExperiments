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
    public static <T> T getFirst(T[] array) {
        return array.length == 0 ? null : array[0];
    }
}