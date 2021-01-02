/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        String[] words = line.split(" ");

        int wordCount = 0;
        for (String word : words) {
            if (!word.trim().isEmpty()) {
                wordCount++;
            }
        }

        System.out.println(wordCount);

        reader.close();
    }
}