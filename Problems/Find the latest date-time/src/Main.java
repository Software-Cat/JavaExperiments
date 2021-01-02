/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime[] dateTimes = new LocalDateTime[scanner.nextInt()];
        scanner.nextLine();

        for (int i = 0; i < dateTimes.length; i++) {
            dateTimes[i] = LocalDateTime.parse(scanner.nextLine());
        }

        LocalDateTime latestDateTime = dateTimes[0];
        for (LocalDateTime dateTime : dateTimes) {
            if (dateTime.compareTo(latestDateTime) > 0) {
                latestDateTime = dateTime;
            }
        }

        System.out.println(latestDateTime);
    }
}