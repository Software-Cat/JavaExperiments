/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;

class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        var levels = new ArrayList<Level>();

        while (SCANNER.hasNext()) {
            levels.add(Level.parse(SCANNER.next().toUpperCase()));
        }

        int sum = 0;
        for (Level level : levels) {
            sum += level.intValue();
        }

        System.out.println(sum);
    }
}