/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.io.InputStream;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws java.io.IOException {
        InputStream inputStream = System.in;
        try (InputStreamReader reader = new InputStreamReader(inputStream)) {
            char[] chars = new char[50];
            reader.read(chars);
            for (char c : chars) {
                if ((byte) c != 0) {
                    System.out.print((byte) c);
                }
            }
        }
    }
}