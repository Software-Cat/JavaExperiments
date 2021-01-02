/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    private static final Pattern PASSWORD = Pattern.compile("[Pp][Aa][Ss][Ss][Ww][Oo][Rr][Dd][\\s:]+[a-zA-Z\\d]+");
    private static final Pattern THE_WORD_PASSWORD = Pattern.compile("[Pp][Aa][Ss][Ss][Ww][Oo][Rr][Dd]");
    private static final Pattern SPACES_AND_COLONS = Pattern.compile("[\\s:]");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Matcher matcher = PASSWORD.matcher(text);

        boolean noPassword = true;
        while (matcher.find()) {
            noPassword = false;
            String passwordRegion = matcher.group();
            passwordRegion = THE_WORD_PASSWORD.matcher(passwordRegion).replaceFirst("");
            passwordRegion = SPACES_AND_COLONS.matcher(passwordRegion).replaceAll("");
            System.out.println(passwordRegion);
        }

        if (noPassword) {
            System.out.println("No passwords found.");
        }
    }
}