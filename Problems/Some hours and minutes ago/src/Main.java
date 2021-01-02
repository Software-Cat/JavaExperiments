/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalTime time = LocalTime.parse(scanner.nextLine());

        time = time.minusHours(scanner.nextInt()).minusMinutes(scanner.nextInt());

        System.out.println(time);
    }
}