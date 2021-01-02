/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in); // use it to read string from the standard input

    @Override
    public void run() {
        while (scanner.hasNext()) {
            String line = scanner.next();
            if (isUpper(line)) {
                System.out.println("FINISHED");
                break;
            }
            System.out.println(line.toUpperCase());
        }
    }

    private boolean isUpper(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}