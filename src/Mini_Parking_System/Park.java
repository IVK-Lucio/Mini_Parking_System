
package Mini_Parking_System;


import java.util.ArrayList;
import java.util.Scanner;

public class Park 
{
    //------------- Encapsulating fields by assigning a private access modifiers ---------
    static  int parkNumber;
    private String location;
    private int maxParkingCapacity;
    private Car car;
    static Scanner sc = new Scanner(System.in);
    
    
    
    
    public Park() 
    {
       //This ensures Parking capacity is 5 vehciles only
       //this.carParkArray = new ArrayList<Vehicle>(maxParkingCapacity); 
    }

     public Park(int parkNumber,String location,int maxParkingCapacity) 
    {
        this.parkNumber = parkNumber;
        this.location = location;
        this.maxParkingCapacity = maxParkingCapacity;
        
    }
    public Park(String location,int maxParkingCapacity,Car car) 
    {
        this.parkNumber = parkNumber;
        this.location = location;
        this.maxParkingCapacity = maxParkingCapacity;
        this.car = car;
    }
    public Park( int parkNumber,String location,int maxParkingCapacity,Car car) 
    {
        this.parkNumber = parkNumber;
        this.location = location;
        this.maxParkingCapacity = maxParkingCapacity;
        this.car = car;
    }

    
    //--------------  Parameterised construstors  ------------------------------- 
    public Park( String location) 
    {
        this.location = location;
        
    }

    //------------------    Setters and getters to decapsulate private intsance vars   --------------------

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static int getParkNumber() {
        return parkNumber;
    }

    public static void setParkNumber(int parkNumber) {
        Park.parkNumber = parkNumber;
    }

    public int getMaxParkingCapacity() {
        return maxParkingCapacity;
    }

    public void setMaxParkingCapacity(int maxParkingCapacity) {
        this.maxParkingCapacity = maxParkingCapacity;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
   
    
    

//    public int getMaxParkingCapacity()
//    {
//        //return this.maxParkingCapacity - this.carParkArray.size();
//    }
     //------------------    End of Setters and getters to decapsulate private intsance vars   --------------------

    @Override
    public String toString() 
    {
        return  "\nPark Number :" + parkNumber + "\nLocation :" + location + "\nMaximum Parking Duration :" + maxParkingCapacity+"\nCar Details :"+car+"\n\n";
    }
    
}
