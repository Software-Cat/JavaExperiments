/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime rangePoint1 = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime rangePoint2 = LocalDateTime.parse(scanner.nextLine());

        LocalDateTime[] dateTimes = new LocalDateTime[Integer.parseInt(scanner.nextLine())];
        for (int i = 0; i < dateTimes.length; i++) {
            dateTimes[i] = LocalDateTime.parse(scanner.nextLine());
        }

        int inRangeCount = 0;
        for (LocalDateTime dateTime : dateTimes) {
            if (isInRange(rangePoint1, rangePoint2, dateTime)) {
                inRangeCount++;
            }
        }

        System.out.println(inRangeCount);
    }

    private static boolean isInRange(ChronoLocalDateTime<LocalDate> rangePoint1, ChronoLocalDateTime<LocalDate> rangePoint2, ChronoLocalDateTime<LocalDate> dateTime) {
        return dateTime.isAfter(rangePoint1) && dateTime.isBefore(rangePoint2) ||
                dateTime.isBefore(rangePoint1) && dateTime.isAfter(rangePoint2) ||
                dateTime.isEqual(rangePoint2) && rangePoint2.isBefore(rangePoint1) ||
                dateTime.isEqual(rangePoint1) && rangePoint1.isBefore(rangePoint2);
    }
}