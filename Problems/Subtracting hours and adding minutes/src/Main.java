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

        dateTime = dateTime.minusHours(scanner.nextInt()).plusMinutes(scanner.nextInt());

        System.out.println(dateTime);
    }
}