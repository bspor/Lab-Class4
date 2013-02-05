/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Brandon
 */
public class TestMyCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // I am going to make a Escort object and hard code its properties
        //instead of making a user input them from the keyboard
        
        
        //By using vehicle instead of car, I am further encapsulating Escort
        //from others. I am however, giving access to set the model and name
        Vehicle myCar = new Escort("Cool", 5, "Beans");
        myCar.setModelNumber("Ford");

        myCar.setVehicleName("Escort");
        
        System.out.println("My car is a " + myCar.getModelNumber());
        System.out.println("The model of my car is " + myCar.getVehicleName());
        System.out.println("My car goes " + myCar.horn());
        
        
        
        //In this case users can access a lot more methods and change more things
        //This could be usefull depending on the requirements! One thing missing
        //from the previous example is the implementation of the interface
        Car myEscort = new Escort("Cool", 4, "Beans");
        
        System.out.println("My car will turn: " + myEscort.getTurnDirection());
        System.out.println("My car is a " + myEscort.getColor());
        System.out.println("My car accelerates at " +  myEscort.getAcceleration() + " mps.");
        System.out.println("My car has  " + myEscort.getNumWheels() + " wheels.");
        //Because my Car goes Honk so will my Escort. The only way I would 
        //change this would be to make it abstract in Car. It is already abstract
        //in vehicle, since maybe a four wheeler might just go beep, and a tractor
        //might make a different noise. In this case though I am saying all cars
        //will go honk, even if that might not be true in the real world
        System.out.println("My car goes " + myEscort.horn());
    }
}
