/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine());

        dateTime = dateTime.plusMinutes(scanner.nextInt());

        System.out.print(dateTime.getYear());
        System.out.print(" ");
        System.out.print(dateTime.getDayOfYear());
        System.out.print(" ");
        System.out.print(dateTime.toLocalTime());
    }
}