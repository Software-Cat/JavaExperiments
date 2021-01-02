/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class Counter {

    int count = 0;

    public synchronized void inc() {
        count++;
    }
}