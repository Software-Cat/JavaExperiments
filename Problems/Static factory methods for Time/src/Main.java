/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        return of(12, 0, 0);
    }

    public static Time midnight() {
        return of(0, 0, 0);
    }

    public static Time ofSeconds(long seconds) {
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(seconds, 0, ZoneOffset.UTC);
        return of(localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
    }

    public static Time of(int hour, int minute, int second) {
        if (hour > 23 || hour < 0) {
            return null;
        } else if (minute > 59 || minute < 0) {
            return null;
        } else if (second > 59 || second < 0) {
            return null;
        }

        Time time = new Time();
        time.hour = hour;
        time.minute = minute;
        time.second = second;
        return time;
    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.println(String.format("%s %s %s", time.hour, time.minute, time.second));
        }
    }
}