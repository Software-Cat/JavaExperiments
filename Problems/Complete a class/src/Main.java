/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}