/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class CounterThread extends Thread {

    @Override
    public void run() {
        long counter = 0;

        while (true) {
            counter++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("It was interrupted");
                break;
            }
        }
    }
}