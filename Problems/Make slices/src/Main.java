/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class Apple {

    private String appleVariety;

    public Apple(String appleVariety) {
        this.appleVariety = appleVariety;
    }

    public static void main(String[] args) {
        Apple apple = new Apple("Gala");
        apple.cutApple();
    }

    void cutApple() {

        // create local inner class Knife
        // create method makeSlices()

        class Knife {
            void makeSlices() {
                System.out.println("Apple " + appleVariety + " is ready to be eaten!");
            }
        }

        Knife knife = new Knife();
        knife.makeSlices();
    }
}