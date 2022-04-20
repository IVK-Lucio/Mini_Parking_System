
package Mini_Parking_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Car extends Vehicle
{
    private int wheelDrive;
    
    
    
    //
    static ArrayList<Car> carList = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    public Car()
    {
    }

    public Car(int wheelDrive) 
    {
        this.wheelDrive = wheelDrive;
    }

    public Car(String vinNumber, String vehicleMake, String vehicleModel,int wheelDrive) 
    {
        super(vinNumber, vehicleMake, vehicleModel);
        this.wheelDrive = wheelDrive;
    }

    public int getWheelDrive() {
        return wheelDrive;
    }

    public void setWheelDrive(int wheelDrive) {
        this.wheelDrive = wheelDrive;
    }

    public static int getVehicleCounter() {
        return vehicleCounter;
    }

    public static void setVehicleCounter(int vehicleCounter) {
        Vehicle.vehicleCounter = vehicleCounter;
    }
    //------------------   method to add a car into a staff profile  -----------------------
    
   //---------------- Method to view All vehilces ------------------
  
   
    @Override
    public String toString() 
    {
        //vinNumber, vehicleMake, vehicleModel
        return  super.toString()+"\n" + super.getVinNumber() +"\nWheel Drive"+wheelDrive+"\n\n";
    }
   
            
}
