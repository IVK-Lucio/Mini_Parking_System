
package Mini_Parking_System;

public class Vehicle implements Drivable
{   
   //------------- Encapsulating fields by assigning a private access modifiers --------- 
   private String vehicleMake;
   private String vehicleModel;
   private String vinNumber;
   static int vehicleCounter;
    public Vehicle()
    {
        
    }
    //--------------  Parameterised construstors  ------------------------------- 
    public Vehicle(String vinNumber,String vehicleMake, String vehicleModel) 
    {
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vinNumber = vinNumber;
    }

    //------------------    Setters and getters to decapsulate private intsance vars   --------------------
    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public static int getVehicleCounter() {
        return vehicleCounter;
    }

    public static void setVehicleCounter(int vehicleCounter) {
        Vehicle.vehicleCounter = vehicleCounter;
    }
    //--------------------   End of setters and getters      ------------------------------
  
  
   //---------------------    toString Method to format objects into a string   --------------------
    @Override
    public String toString() 
    {
        return "\nVin Number :" + vinNumber + "\nVehicle Make :" + vehicleMake + "\nVehicle Model :" + vehicleModel;
    }
   
   
   
   
}
