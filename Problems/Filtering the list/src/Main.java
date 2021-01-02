/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> list = Arrays.stream(
                SCANNER.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        list.removeIf(new Predicate<>() {
            private int index = 0;

            @Override
            public boolean test(Integer integer) {
                if (index % 2 == 0) {
                    index++;
                    return true;
                }
                index++;
                return false;
            }
        });
        Collections.reverse(list);

        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i);
            sb.append(" ");
        }

        System.out.println(sb);
    }
}