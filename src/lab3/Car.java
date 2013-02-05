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
    String color;
    int numWheels;
    String engineType;
    
    //Constructor
    public Car(String color, int numWheels, String engineType) {
        this.color = color;
        this.numWheels = numWheels;
        this.engineType = engineType;
    }
    

    //Each car may have its own way or rate of acceleration
    //so it needs to be redefined in each class
    public double getAcceleration(double acceleration) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    //Each car may have its own way or rate of slowingdown
    //so it needs to be redefined in each class
    public double getSlowDown(double slowDown) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    //Each car may have its own way or rate of turning
    //so it needs to be redefined in each class
    public String getTurnDirection(String direction) {
        throw new UnsupportedOperationException("Not supported yet.");
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
}
