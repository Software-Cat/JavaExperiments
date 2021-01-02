/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern VALID_IP = Pattern.compile("(1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.(1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.(1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.(1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])");

    public static void main(String[] args) {
        String ip;
        try (Scanner scanner = new Scanner(System.in)) {
            ip = scanner.nextLine();
        }

        boolean isValid = VALID_IP.matcher(ip).matches();

        if (isValid) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}