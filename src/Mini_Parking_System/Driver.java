
package Mini_Parking_System;

import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
public class Driver 
{
    
    static int IC = 0;
    private static Scanner in = new Scanner(System.in);
    
    //
    //Assigning static Car Values 
    static Car car1 = new Car("VW1414","Toyota Corolla","2015",4);
    static Car car2 = new Car("MB1354","Mercedes Benz C63","2012",4);
    static Car car3 = new Car("UD198","Audi A3","2020",4);
    static Car car4 = new Car("BMW634","BMW 520i","2020",4);
    static Car car5 = new Car("UD1354","Audi A5","2020",4);
    
    //Asdding static Stuff memebers
    static Staff staff1 = new Staff("Elly Davis","edavis","nust2020","FCI",1006545,12,18,"August",1990,car1);
    static Staff staff2 = new Staff("Anicia Peter ","apeter","nust2020","Registrar",1004875,12,14,"July",1958,car2);
    static Staff staff3 = new Staff("Elly David","edavid","nust2020","FCI",1006147,12,25,"January",1987,car3);
    static Staff staff4 = new Staff("Rita gabriel","rgabriel","nust2020","FCI",1006147,12,25,"January",1987,car4);
    
    
    static Park part1 = new Park("Upper Campus ",10,car1);
    static Park part2 = new Park("Lower Campus B",5,car2);
    static Park part3 = new Park("Lower Campus",7,car3);
    static Park part4 = new Park("Nust Hostel",8,car4);
    static Park part5 = new Park("Nust Hostel",8,car5);
    
     static Park lower = new Park(1,"Lower Campus",150);
     static Park upper = new Park(1,"Upper Campus",110);
     static Park hotelSchool = new Park(1,"Hotel School",110);
    
    
    
    
    
    static ArrayList<Car> carList = new ArrayList<>(); 
    static ArrayList<Staff> staffList = new ArrayList<>(); 
    static ArrayList<Park> parkingList = new ArrayList<>();
     static ArrayList<Park> parkingBays = new ArrayList<>();
    
    
    
    
    public static void main(String[] args) throws Exception 
    {
       
           mainMenu();
    }
    
    public static void mainMenu() throws InterruptedException, Exception
    {
        Scanner in = new Scanner(System.in);
        int input;
        String user,pass;
        
        staffList.add(staff1);
        
        do 
        {
            System.out.println("================================================");
            System.out.println("==  WELCOME TO FAC PARKING MANAGEMENT SYSTEM  ==");
            System.out.println("================================================");
            System.out.println("\nChose an option to continue\n");
            System.out.println("1.Login as Admin");
            System.out.println("2.Login as Staff");
            System.out.println("3.Register ");
            System.out.print("\nEnter an Option:");
            input = in.nextInt();
            switch (input) 
            {
                case 1:
                      System.out.println("..........................................");
                      System.out.println("Enter Username");
                      user = in.next();
                      System.out.println("Enter Password");
                      pass = in.next();
                      System.out.println(".........................................");
                      System.out.println("\n\n...Logging you in...");
                      Thread.sleep(2000);
                      for(Staff st : staffList)
                      {
                          if (user.equalsIgnoreCase("elly") && pass.equalsIgnoreCase("2020")) 
                          {
                               System.out.println("Login Successful.");
                               System.out.println("Redirecting...");
                               System.out.println("Welcome to admin Panel dear ");
                               Thread.sleep(2000);
                               menu();
                          }
                          else
                          {
                               System.out.println("Invalid username or password...");
                               Thread.sleep(2000);
                               System.out.println("Do you want to try again? Yes/No");
                               String answer = in.next();
                               if("Yes".equals(answer))
                              {
                                  login();
                              }else
                              {
                                  
                              }
                          }
                      }
                      
                      
                   
                   break;
               case 2:
                      System.out.println("..........................................");
                      System.out.println("Enter Username");
                      user = in.next();
                      System.out.println("Enter Password");
                      pass = in.next();
                      System.out.println(".........................................");
                      System.out.println("\n\n...Logging you in...");
                      Thread.sleep(2000);
                      for(Staff st : staffList)
                      {
                          if (user.equalsIgnoreCase(st.getUsername()) && pass.equalsIgnoreCase(st.getPassword())) 
                          {
                               System.out.println("Login Successful.");
                               System.out.println("Redirecting..."); 
                               System.out.println("Welcome to admin Panel dear "+st.getName());
                               Thread.sleep(2000);
                               users();
                          }
                          else
                          {
                               System.out.println("Invalid username or password...");
                               Thread.sleep(2000);
                               System.out.println("Do you want to try again? Yes/No");
                               String answer = in.next();
                               if("Yes".equals(answer))
                              {
                                  login();
                              }else
                              {
                                  
                              }
                          }
                      }
                    break;
                case 3:
                    register();
                    break;
                case 4:System.exit(0);
                    break;
                default:System.out.println("Error:Invalid entry!!");
            }
        }
        while (true);  
    }
    public static void users() throws InterruptedException, Exception
    {
         int input;
        do 
        {
            System.out.println("Logging in ....");
            Thread.sleep(1000);
            System.out.println("");
            System.out.println("\n       1.add Vehicle"
                             + "\n       2.Back to Main Menu");
            System.out.println("");
            System.out.println("Select an Option to continue");
            input = in.nextInt();
            Driver main = new Driver();
            switch (input) 
            {
                case 1:
                     addVehicle(carList);
                     break;
                case 2:
                    mainMenu();
                    break;
                default:
                    
            }
        } while (true);
        
    }
        
    static void menu() throws InterruptedException, Exception
    {
        int input;
        do 
        {
            System.out.println("Logging in ....");
            Thread.sleep(1000);
            System.out.println("");
            System.out.println("\n       1.View All Users"
                             + "\n       2.Print All Parked Vehicles "
                             + "\n       3.View All Vehicles"
                             + "\n       4.View Available Parking"
                             + "\n       5.View Parking Details "
                             + "\n       6.Back to Main Menu");
            System.out.println("");
            System.out.println("Select an Option to continue");
            input = in.nextInt();
            Driver main = new Driver();
            switch (input) 
            {
                case 1:
                    ArrayList<Staff> staffList = new ArrayList<>();
                    Driver.viewAllUsers(staffList);
                    break;
                case 2:
                    break;
                case 3:main.viewAllVehicles();
                    break;
                case 4:
                    viewAvailableParking();
                    break;
                case 5:
                    viewParkingDetails();
                    break;
                case 6:
                 Driver.mainMenu();
                    
                    break;
                default:
                    
            }
        } while (true);
        
    }
    public static void printAllParkedVehicles(ArrayList<Car> carList)
    {
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        String formatter ="| %-10s | %-10s | %-20s |  %-10s | %-10d%n";
        System.out.format("===================================================================|%n");
        System.out.printf("| Car No     | VIN N0        | Make       | Model    | Wheel Drive |%n");
        System.out.format("===================================================================+%n");
        Park.parkNumber = 0;
        for (Car cr : carList) 
        {
            System.out.format(formatter,++Park.parkNumber ,cr.getVinNumber(),cr.getVehicleMake(),cr.getVehicleModel(),cr.getWheelDrive());
            
        }
        System.out.format("==================================================================%n");
    }
    public static void addVehicle(ArrayList<Car> carList)
    {
        String vN,vMake,vModel;
        int wheelDrive;
        System.out.println("Enter Vin Number :");
        vN = in.next();
        System.out.println("Enter Num Wheel Drive :");
        wheelDrive = in.nextInt();
        System.out.println("Enter Car make :");
        vMake = in.next();
        System.out.println("Enter car Model :");
        vModel = in.next();
        Car car = new Car(vN,vMake,vModel,wheelDrive);
        carList.add(car);
        System.out.println("Adding Vehicle to user profile ...");
        System.out.println("Vehicle Added Successfully");
        
        String formatter ="| %-10s | %-10s | %-10s |  %-10s | %-10d%n";
        System.out.format("===================================================================|%n");
        System.out.printf("| Car No     | VIN N0        | Make       | Model    | Wheel Drive |%n");
        System.out.format("===================================================================+%n");
        Park.parkNumber = 0;
        for (Car cr : carList) 
        {
            System.out.format(formatter,++Park.parkNumber ,cr.getVinNumber(),cr.getVehicleMake(),cr.getVehicleModel(),cr.getWheelDrive());
            
        }
        System.out.format("\n==================================================================%n");
        
        
    }
   
    public static void viewAllUsers(ArrayList<Staff> staffList)
    {
        staffList.add(staff1);
        staffList.add(staff2);
        staffList.add(staff3);
        staffList.add(staff4);
        String formatter ="| %-15s | %-10s | %-15s |  %-10d | %-10d | %-15s | %-25h %n";
        System.out.format("======================================================================================================|%n");
        System.out.printf("| Name     | Username     | Deparment       | Staff No    | Disc No | Date Of Birth| Vehicle Details  |%n");
        System.out.format("======================================================================================================+%n");
        int num = 0;
        for (Staff st : staffList) 
        {
            System.out.format(formatter,st.getName(),st.getUsername(),st.getDepartment(),st.getStaffNumber(),st.getParkingTicket(),st.getDateOfBirth(),st.getVehicle());   
        }
        System.out.format("====================================================================================================%n"); 
    }
     public void viewAllVehicles()
   {
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        String formatter ="| %-10s | %-10s | %-20s |  %-10s | %-10d%n";
        System.out.format("===================================================================|%n");
        System.out.printf("| Car No     | VIN N0        | Make       | Model    | Wheel Drive |%n");
        System.out.format("===================================================================+%n");
        Park.parkNumber = 0;
        for (Car cr : carList) 
        {
            System.out.format(formatter,++Park.parkNumber ,cr.getVinNumber(),cr.getVehicleMake(),cr.getVehicleModel(),cr.getWheelDrive());
            
        }
        System.out.format("==================================================================%n");
   }
   
    public static void viewAvailableParking()
    {
       parkingBays.add(lower);
       parkingBays.add(upper);
       parkingBays.add(hotelSchool);
       String formatter ="| %-10d | %-10s |  %-10d | %n";
        System.out.format("=====================================================|%n");
        System.out.printf("| Park Bay No  | Location       | Parking Capacity   |%n");
        System.out.format("====================================================+%n");
       for(Park p :parkingBays )
       {
           System.out.format(formatter,++Park.parkNumber,p.getLocation(),p.getMaxParkingCapacity());
       }
        System.out.format("====================================================+%n");
    }
    public static void calcateParkingCost()
    {
        
    }
     public static  void login() throws IOException, Exception
    {
        Login login = new Login();
        login.login();
    }
    public void requestParkingSpace()
    {
        
    }
    public void assignParkingSpace()
    {
        
    }
    public static void viewParkingDetails()
    {
        parkingList.add(part1);
        parkingList.add(part2);
        parkingList.add(part3);
        parkingList.add(part4);
        parkingList.add(part5);
        //"Upper Campus ",10,car1)
        String formatter ="| %-10d | %-10s | %-4d |  %-15s |%n";
        System.out.format("===================================================================|%n");
        System.out.printf("| Park No     | Location        | Capacity     |Parked Car         |%n");
        System.out.format("===================================================================+%n");
        Park.parkNumber = 0;
        for (Park p : parkingList) 
        {
            System.out.format(formatter,++Park.parkNumber,p.getLocation(),p.getMaxParkingCapacity(),p.getCar());
            
        }
        System.out.format("==================================================================%n");
    }
    public static void register()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\nCreate New User Account\n--------------------------");
        System.out.print("Enter  name: ");
        //setName(input.nextLine());
        System.out.print("Enter new username: ");
        String username = input.nextLine();
        System.out.print("Enter new password: ");
        String passwordFirstTyped = input.nextLine();
        System.out.print("Retype new password: ");
        String passwordRetyped = input.nextLine();
        
        while(!passwordFirstTyped.equals(passwordRetyped))
        {
            System.out.println("Retyped password does not match! Try again.");
            System.out.print("Enter new password: ");
            passwordFirstTyped = input.nextLine();
            System.out.print("Retype new password: ");
            passwordRetyped = input.nextLine();
        }
        String password = passwordFirstTyped;
    }
    

    
              
}
