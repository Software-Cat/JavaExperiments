/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(50);
        sb.append(reader.readLine());
        sb.reverse();
        reader.close();

        System.out.println(sb.toString());
    }
}