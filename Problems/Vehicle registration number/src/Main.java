/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine(); // a valid or invalid registration number

        System.out.println(regNum.matches("[ABEKMHOPCTYX]\\d{3}[ABEKMHOPCTYX]{2}"));
    }
}