/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile("[^\\s]" + part + "[^\\s]", Pattern.CASE_INSENSITIVE);

        if (pattern.matcher(line).find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}