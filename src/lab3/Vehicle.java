package lab3;

/**
 *
 * @author Brandon
 */
public class Vehicle {
    //My variables
    String vehicleName;
    String horn;
    String modelNumber;
    
    //Since all my vehicles will have a horn they will inherit this method
    //It will need to be over-written however, because some will honk, others 
    //will simply beep
    public String Horn  (String horn) {
        return horn;
    }
    
    //All vehicles will have these properties
    //There is no reason to make these abstract as all subclasses can benefit
    //from using these setters/getters with no need to modify the method
    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }       
}
