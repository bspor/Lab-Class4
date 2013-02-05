/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Brandon
 * Car is a subclass of vehicle and will implement the interface Cars
 * which describes the methods that all Cars will have
 */
public class Car extends Vehicle implements Cars {
    //Not only will cars do the things inherited by Vehicle and enforced by
    //Cars, but they will also have things such as a color, number of wheels,
    //and engine
    //Variables
    private String color;
    private int numWheels;
    private String engineType;
    
    //Constructor
    public Car(String color, int numWheels, String engineType) {
        this.color = color;
        this.numWheels = numWheels;
        this.engineType = engineType;
    }


        
    
    //Each car may have its own way or rate of acceleration
    //so it needs to be redefined in each class
    public double getAcceleration() {
        //There would be a complex algorith here to determine
        //the acceleration of this car. I am going to hard code it to 
        // 5. This would be in meters per second
        return 5;
        
    }
    
    //Each car may have its own way or rate of slowingdown
    //so it needs to be redefined in each class
    public double getSlowDown() {
        //Same as acceleration
        return 3;
    }
    
    //Each car may have its own way or rate of turning
    //so it needs to be redefined in each class
    public String getTurnDirection() {
        //There would be an algorithm to determine if the car was going to turn
        //left or right. I will hard code it to do right hand turns only. It
        //has a phobia.
        return "Right";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String horn() {
        return "Honk";
    }

    public String getTurnDirection(String direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
