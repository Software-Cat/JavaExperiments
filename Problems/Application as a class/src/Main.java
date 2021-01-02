/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class Application {

    String name;

    void run(String[] args) {
        System.out.println(name);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}