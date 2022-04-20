
package Mini_Parking_System;

import static Mini_Parking_System.Car.carList;
import java.util.ArrayList;

public class Staff
{
    //------------- Encapsulating fields by assigning a private access modifiers --------- 
    private String name;
    private String username;
    private String password;
    private String department;
    private int staffNumber;
    private int parkingTicket;
    private Date dateOfBirth; //Declaring Composition realtionshipo
    private Car vehicle; //Aggreagtion relation declaration
    
    
     Car car = new Car();
    //Static Staff Memebers
  
    //
    static ArrayList<Staff> staffList = new ArrayList<>(); 
    //-------------  Empty constritcors   ----------------------------
    public Staff() 
    {
        
    }
    
    
     //--------------  Parameterised construstors  ------------------
    public Staff(String name,String username,String password,String department, int staffNumber, int parkingTicket, int day,String month,int year, Car vehicle) 
    {
        this.name = name;
        this.username = username;
        this.password = password;
        this.department = department;
        this.staffNumber = staffNumber;
        this.parkingTicket = parkingTicket;
        this.dateOfBirth = new Date(day,month,year);// Creating a Composition relationship
        this.vehicle = vehicle;//Creating a Aggregation Relationship
    }
    
    
    //------------------    Setters and getters to decapsulate private intsance vars   --------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String getUsername()
    {
        return username;
    }
     public void setPassword(String password)
    {
        this.password = password;
    }
     public String getPassword() 
     {
        return password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }

    public int getParkingTicket() {
        return parkingTicket;
    }

    public void setParkingTicket(int parkingTicket) {
        this.parkingTicket = parkingTicket;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Car getVehicle() {
        return vehicle;
    }

    public void setVehicle(Car vehicle) 
    {
        this.vehicle = vehicle;
    }
     //------------------  End of Setters and getters  --------------------
    
    
    //-------------------
  
   
     //String name,String username,String password,String department, 
    //int staffNumber, int parkingTicket, Date, Car vehicle
   
    
    //---------------------    toString Method to format objects into a string   --------------------

    @Override
    public String toString() {
        return  "\nStaff Name :" + name + "\nDepartment :" + department + "\nStaff Number :" + staffNumber + "\nParking Ticket :" + parkingTicket + "\nDate of Birth :" + dateOfBirth + "\nvehicle :" + vehicle;
    }
    

}
