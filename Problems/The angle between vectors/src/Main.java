/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Scanner;

class Main {
    private Main() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ax = scanner.nextDouble();
        double ay = scanner.nextDouble();
        double bx = scanner.nextDouble();
        double by = scanner.nextDouble();

        double theta = StrictMath.toDegrees(StrictMath.acos(dot(ax, ay, bx, by) / (mag(ax, ay) * mag(bx, by))));

        System.out.println(theta);
    }

    private static double mag(double x, double y) {
        return StrictMath.abs(StrictMath.hypot(x, y));
    }

    private static double dot(double ax, double ay, double bx, double by) {
        return ax * bx + ay * by;
    }
}