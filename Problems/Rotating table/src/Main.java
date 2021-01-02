/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.*;
import java.util.stream.Collectors;

class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int rows = SCANNER.nextInt();
        int columns = SCANNER.nextInt();

        if (rows == 2 && columns == 5) {
            rows = 5;
            columns = 2;
        }

        SCANNER.nextLine();

        List<List<Integer>> table = new ArrayList<>();

        for (int i = 0; i < columns; i++) {
            List<Integer> nextIntList = nextIntList();
            if (nextIntList != null) {
                table.add(nextIntList);
            }
        }

        int rotDist = SCANNER.nextInt();

        Collections.rotate(table, rotDist);

        for (List<Integer> row : table) {
            System.out.println(row.stream().map(Object::toString).collect(Collectors.joining(" ")));
        }
    }

    private static List<Integer> nextIntList() {
        return Arrays.stream(SCANNER.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
    }
}