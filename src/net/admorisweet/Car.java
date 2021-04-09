package net.admorisweet;

public class Car extends Vehicle{
    private int numDoors;
    private String make;



    public Car(int numWheels, String type, int maxSpeed, String engine, int numDoors, String make) {
        super(numWheels, type, maxSpeed, engine);
        this.numDoors = numDoors;
        this.make = make;
    }
    public int getNumDoors(){
        return this.numDoors;
    }
    public String getMake(){
        return this.make;
    }
}
