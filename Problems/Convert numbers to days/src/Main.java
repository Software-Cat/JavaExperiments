/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        LocalDate date1 = LocalDate.of(year, 1, 1).withDayOfYear(scanner.nextInt());
        LocalDate date2 = LocalDate.of(year, 1, 1).withDayOfYear(scanner.nextInt());
        LocalDate date3 = LocalDate.of(year, 1, 1).withDayOfYear(scanner.nextInt());

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}