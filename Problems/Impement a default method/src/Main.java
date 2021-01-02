/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

interface Printer {
    default void print() {
        System.out.println("This is a default message");
    }
}

class Main {
    public static void main(String... args) {
        Printer printer = new ConsolePrinter();
        printer.print(); // prints: This is a default message
    }
}

class ConsolePrinter implements Printer {
}