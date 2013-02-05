/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Brandon
 */
public class Escort extends Car implements Cars {
    //The Escort is a particular car. It is with this class that we will define
    //all of the things that make an Escort and Escort and not a Mustang
    
   
    public Escort(String color, int numWheels, String engineType) {
        //I am going to say all escorts in this case will be red, with 4 wheels
        //and V4 turbo engine
        super("red", 4, "V4 turbo");
    }    

    @Override
    public String getTurnDirection(String direction) {
        return super.getTurnDirection(direction);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public int getNumWheels() {
        return super.getNumWheels();
    }

    @Override
    public void setNumWheels(int numWheels) {
        super.setNumWheels(numWheels);
    }

    @Override
    public String getEngineType() {
        return super.getEngineType();
    }

    @Override
    public void setEngineType(String engineType) {
        super.setEngineType(engineType);
    }
}
