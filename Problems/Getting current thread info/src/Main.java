/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class Info {

    public static void printCurrentThreadInfo() {
        System.out.println("name: " + Thread.currentThread().getName());
        System.out.println("priority: " + Thread.currentThread().getPriority());
    }
}