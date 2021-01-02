/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class Create {

    public static Runnable createRunnable(String text, int repeats) {
        return new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < repeats; i++) {
                    System.out.println(text);
                }
            }
        };
    }
}