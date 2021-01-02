/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class Vehicle {

    // vehicle of your dream

    class Engine {

        void start() {
            System.out.println("RRRrrrrrrr....");
        }
    }
}

class EnjoyVehicle {

    public static void startVehicle() {
        Vehicle vehicle = new Vehicle();
        Vehicle.Engine engine = vehicle.new Engine();
        engine.start();
        System.gc();
    }
}