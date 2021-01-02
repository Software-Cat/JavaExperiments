/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    private static final Pattern PROGRAM = Pattern.compile("\\bprogram[a-z]*\\b", Pattern.CASE_INSENSITIVE);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Matcher matcher = PROGRAM.matcher(text);

        while (matcher.find()) {
            int startIndex = matcher.start();
            String word = matcher.group();
            System.out.println(startIndex + " " + word);
        }
    }
}