/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class Vehicle {

    private String name;

    Vehicle(String name) {
        this.name = name;
    }

    class Engine {

        void start() {
            System.out.println("RRRrrrrrrr....");
        }

    }

    class Body {

        private String color;

        Body(String color) {
            this.color = color;
        }

        void printColor() {
            System.out.println("Vehicle " + Vehicle.this.name + " has " + color + " body.");
        }
    }
}

// this code should work
class EnjoyVehicle {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Dixi");
        Vehicle.Body body = vehicle.new Body("red");
        body.printColor();
    }
}