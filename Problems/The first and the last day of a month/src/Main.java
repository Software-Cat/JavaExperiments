/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate firstDay = LocalDate.of(scanner.nextInt(), scanner.nextInt(), 1);

        LocalDate lastDay = LocalDate.of(firstDay.getYear(), firstDay.getMonthValue(), firstDay.lengthOfMonth());

        System.out.print(firstDay);
        System.out.print(" ");
        System.out.print(lastDay);
    }
}