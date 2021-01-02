/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;
import java.util.Arrays;

class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<? extends T> streamList = stream.collect(Collectors.toList());
        T min = streamList.stream().min(order).orElse(null);
        T max = streamList.stream().max(order).orElse(null);
        minMaxConsumer.accept(min, max);
    }
}