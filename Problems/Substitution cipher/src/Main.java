/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        char[] keys = SCANNER.nextLine().toCharArray();
        char[] values = SCANNER.nextLine().toCharArray();

        Map<String, String> cipher = new HashMap<>();
        for (int i = 0; i < values.length; i++) {
            cipher.put(String.valueOf(keys[i]), String.valueOf(values[i]));
        }

        System.out.println(encode(SCANNER.nextLine(), cipher));
        System.out.println(decode(SCANNER.nextLine(), cipher));
    }

    private static String encode(String message, Map<String, String> cipher) {
        char[] oldMessage = message.toCharArray();
        char[] newMessage = new char[message.length()];

        for (var entry : cipher.entrySet()) {
            for (int i = 0; i < message.length(); i++) {
                if (oldMessage[i] == entry.getKey().toCharArray()[0]) {
                    newMessage[i] = entry.getValue().toCharArray()[0];
                }
            }
        }

        return String.valueOf(newMessage);
    }

    private static String decode(String message, Map<String, String> cipher) {
        char[] encryptedMessage = message.toCharArray();
        char[] originalMessage = new char[message.length()];

        for (var entry : cipher.entrySet()) {
            for (int i = 0; i < message.length(); i++) {
                if (encryptedMessage[i] == entry.getValue().toCharArray()[0]) {
                    originalMessage[i] = entry.getKey().toCharArray()[0];
                }
            }
        }

        return String.valueOf(originalMessage);
    }
}