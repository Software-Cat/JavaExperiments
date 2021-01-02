/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        LocalDate date = LocalDate.parse(input[0]);
        date = date.plusDays(Integer.parseInt(input[1]));

        System.out.println(date.getMonthValue() == 1 && date.getDayOfYear() == 1);
    }
}