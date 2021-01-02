/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class Problem {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("test")) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}