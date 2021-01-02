/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern HAS_UPPER = Pattern.compile(".*[A-Z].*");
    private static final Pattern HAS_LOWER = Pattern.compile(".*[a-z].*");
    private static final Pattern HAS_DIGIT = Pattern.compile(".*\\d.*");
    private static final Pattern TWELVE_SYMBOLS = Pattern.compile(".{12,}");

    private Main() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (HAS_UPPER.matcher(password).matches()) {
            if (HAS_LOWER.matcher(password).matches()) {
                if (HAS_DIGIT.matcher(password).matches()) {
                    if (TWELVE_SYMBOLS.matcher(password).matches()) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }

        System.out.println("NO");
    }
}