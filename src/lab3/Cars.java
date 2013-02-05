/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

public interface Cars  {
    //While Car will be a subclass of vehicle I am going to have all cars
    //be able to accelerate, slow down, and turn
    double getAcceleration ();
    double getSlowDown ();
    String getTurnDirection (String direction);
}
