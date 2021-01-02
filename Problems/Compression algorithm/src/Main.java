/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.ArrayList;
import java.util.Scanner;

class Tuple<X, Y> {
    public final X x;
    public final Y y;

    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayList<Tuple<Character, Integer>> charCounts = new ArrayList<>();

        char lastChar = input.charAt(0);
        int charCount = 0;
        for (char c : input.toCharArray()) {
            if (c == lastChar) {
                charCount++;
            } else {
                charCounts.add(new Tuple<Character, Integer>(lastChar, charCount));
                charCount = 1;
            }
            lastChar = c;
        }
        charCounts.add(new Tuple<Character, Integer>(lastChar, charCount));

        StringBuilder compressed = new StringBuilder();
        for (Tuple<Character, Integer> charSequence : charCounts) {
            compressed.append(charSequence.x);
            compressed.append(charSequence.y);
        }

        System.out.println(compressed.toString());
    }
}