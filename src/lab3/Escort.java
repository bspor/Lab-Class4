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
        super(color, numWheels, engineType);
    }

    public String getHorn() {
        return horn;
    }

    public void setHorn(String horn) {
        this.horn = horn;
    }
    
}
