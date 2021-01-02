/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

// do not remove imports

import java.util.*;
import java.util.function.Function;

class ArrayUtils {
    public static <E> String info(E[] array) {
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        List<String> strings = new ArrayList<>();
        for (E element : array) {
            strings.add(element.toString());
        }
        sb.append(String.join(", ", strings));

        sb.append("]");

        return sb.toString();
    }
}