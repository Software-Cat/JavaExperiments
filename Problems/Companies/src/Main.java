/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.List;
import java.util.Scanner;

class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                List.of(
                        SCANNER.nextLine().split(" ")
                )
        );
    }
}