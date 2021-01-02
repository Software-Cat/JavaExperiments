/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class Problem {

    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        for (int i = 0; i <= args.length - 1; i += 2) {
            System.out.println(args[i] + "=" + args[i + 1]);
        }
    }
}