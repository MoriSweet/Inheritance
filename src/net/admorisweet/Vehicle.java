package net.admorisweet;

public class Vehicle {

    private int numWheels;
    private String type;
    private int maxSpeed;
    private String engine;


    public Vehicle(int numWheels, String type, int maxSpeed, String engine){
        this.numWheels = numWheels;
        this.engine = engine;
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
    public int getNumWheels(){
      return this.numWheels;
    }
    public String getType(){
        return this.type;
    }
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    public String getEngine(){
        return this.engine;
    }

}
