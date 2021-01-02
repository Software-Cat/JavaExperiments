/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate date = LocalDate.of(scanner.nextInt(), 1, 1).withDayOfYear(scanner.nextInt());

        int dayOfMonth = date.getDayOfMonth();

        System.out.println(dayOfMonth == 1);
    }
}