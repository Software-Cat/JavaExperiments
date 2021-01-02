/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> sequence = nextIntList();

        List<Integer> matching = nextIntList();

        System.out.print(Collections.indexOfSubList(sequence, matching));
        System.out.print(" ");
        System.out.print(Collections.lastIndexOfSubList(sequence, matching));
    }

    private static List<Integer> nextIntList() {
        return Arrays.stream(SCANNER.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
    }
}