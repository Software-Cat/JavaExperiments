/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String dna = scanner.nextLine();
            dna = dna.toUpperCase(Locale.ENGLISH);

            double count = 0;
            for (char c :
                    dna.toCharArray()) {
                if ('G' == c || 'C' == c) {
                    count++;
                }
            }

            System.out.println(count / dna.length() * 100);
        }
    }
}