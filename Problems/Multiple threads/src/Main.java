/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

public class Main {

    public static void main(String[] args) {
        Thread worker1 = new WorkerThread();
        worker1.setName("worker-1");
        Thread worker2 = new WorkerThread();
        worker2.setName("worker-2");

        worker1.start();
        worker2.start();
    }
}

// Don't change the code below
class WorkerThread extends Thread {

    private static final int NUMBER_OF_LINES = 3;

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (!name.startsWith("worker-")) {
            return;
        }

        for (int i = 0; i < NUMBER_OF_LINES; i++) {
            System.out.println("do something...");
        }
    }
}