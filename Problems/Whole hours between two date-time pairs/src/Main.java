/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime dateTime1 = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime dateTime2 = LocalDateTime.parse(scanner.nextLine());

        long hourDifference = ChronoUnit.HOURS.between(dateTime1, dateTime2);

        System.out.println(hourDifference);
    }
}