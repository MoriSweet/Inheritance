package net.admorisweet;

public class Main {
    public static void main(String[] args){


        Car car = new Car(4,"Sedan", 9999, "V12", 4, "Lambo");
        System.out.println("number of wheels: " + car.getNumWheels());
        System.out.println("type of car: " + car.getType());
        System.out.println("max travel speed in MPH: " + car.getMaxSpeed());
        System.out.println("type of engine: " + car.getEngine());
        System.out.println("number of doors: " + car.getNumDoors());
        System.out.println("make of car: " + car.getMake());
    }
}
