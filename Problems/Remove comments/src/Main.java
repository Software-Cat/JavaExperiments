/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codeWithComments = scanner.nextLine();

        System.out.println(codeWithComments.replaceAll("(/\\*.*?\\*/|//.*)", "").trim());
    }
}