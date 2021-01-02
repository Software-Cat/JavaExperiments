/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class ComputerFacadeTestDrive {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();

        ComputerFacade computerFacade = new ComputerFacade(processor, monitor, keyboard);

        computerFacade.turnOnComputer();
        computerFacade.turnOffComputer();
    }
}

abstract class Subsystem {

    private final String description;

    protected Subsystem(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }
}

class ComputerFacade {

    private final Processor processor;
    private final Monitor monitor;
    private final Keyboard keyboard;

    public ComputerFacade(Processor processor, Monitor monitor, Keyboard keyboard) {
        this.processor = processor;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public void turnOnComputer() {
        processor.on();
        monitor.on();
        keyboard.on();
    }

    public void turnOffComputer() {
        keyboard.off();
        monitor.off();
        processor.off();
    }
}

class Processor extends Subsystem {

    public Processor() {
        super("Processor");
    }
}

class Monitor extends Subsystem {

    protected Monitor() {
        super("Monitor");
    }
}

class Keyboard extends Subsystem {

    protected Keyboard() {
        super("Keyboard");
    }

    @Override
    public void on() {
        super.on();
        System.out.println("Backlight is turned on");
    }

    @Override
    public void off() {
        super.off();
        System.out.println("Backlight is turned off");
    }
}