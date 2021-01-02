/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String replacing = scanner.nextLine();

        input = input.replaceAll(replacing, "`");

        int occurrences = 0;
        for (char c : input.toCharArray()) {
            if ('`' == c) {
                occurrences++;
            }
        }

        System.out.println(occurrences);
    }
}