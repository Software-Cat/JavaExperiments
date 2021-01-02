/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class SimpleCounter {

    private static SimpleCounter instance = new SimpleCounter();

    public int counter = 0;

    private SimpleCounter() {

    }

    public static SimpleCounter getInstance() {
        return instance;
    }
}