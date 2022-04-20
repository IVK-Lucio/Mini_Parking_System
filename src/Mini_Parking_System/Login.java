
package Mini_Parking_System;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Login 
{
     private String username, password,name;
    static ArrayList<Login> users = new ArrayList<>(); 

    public Login(String name, String username, String password) 
    {
        this.username = username;
        this.password = password;
        this.name = name;
        
    }

    public Login() {}

    
    public void setName(String name)
    {
        this.name= name;
    }
    public String getName()
    {
        return name;
    }
    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static ArrayList<Login> getStaff() 
    {
        return users;
    }

    public static void setStaff(ArrayList<Login> userss)
    {
        Login.users = users;
    }
    
    
    
    //create user accounts
    public void createNewUser()
    {
        //invoke the methid to enter user details here
        enterUserDetails(); 
        boolean isUserExist = false;//user not created yet so it test fALSE 
        for(Login usr: users)
        {
            //check whether the user being created already in the system 
            if (usr.username.equals(username) && usr.password.equals(password)){
                isUserExist = true;
                System.out.println("\nUser Account Already Exists!\n");
                break;
            }
        } 
        //if not exust then he will be added in the system
        if (!isUserExist){
            users.add(this);
            System.out.println("New User Account Successfully Created.");
            displayUser();
        } //
    }
    //default user values
    public void defaulUser()
    {
        Login user1 = new Login("elly jessy","ejessy","0000");
        Login user2 = new Login("E Nust ","enust","1111");
        Login user3 = new Login("nust ","n","2020!");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        
    }
    public void displayUser()
    {
        System.out.println("\nUsers List\n-------------");
        int count = 1;
        for (Login user: users){
            System.out.print(count + ".User Name: ");
            System.out.println(user.username);
            System.out.print("   User Password: ");
            System.out.println(user.password);
            count++;
        } 
    }
    
    //entering userdetails to authenticate against the system 
    public void enterUserDetails()
    {
       
        Scanner input = new Scanner(System.in);
        System.out.println("\nCreate New User Account\n--------------------------");
        System.out.print("Enter  name: ");
        setName(input.nextLine());
        System.out.print("Enter new username: ");
        username = input.nextLine();
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
        password = passwordFirstTyped;
    }

    void login() throws InterruptedException, IOException, Exception 
    {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
           //System.out.println("...............  Hello User ........................");
            System.out.println("....................................................");
            System.out.print("USERNAME: ");
            String user = br.readLine();
            System.out.print("PASSWORD: ");
            String pass = br.readLine();
            System.out.println("....................................................");
            System.out.println("\n\n...Logging you in...");
            Thread.sleep(2000);
            for(int i = 0;i<users.size();i++){
            if(users.get(i).getUsername().equals(user)&&users.get(i).getPassword().equals(pass))
            {
                System.out.println("Login Successful.");
                System.out.println("Redirecting...");
                Thread.sleep(2000);
                menu();
                
            }else
            {
                System.out.println("Invalid username or password...");
                Thread.sleep(2000);
                System.out.println("Do you want to try again? Yes/No");
                String answer = br.readLine();
                if("Yes".equals(answer))
                {
                    login();
                }else{
                    //12Driver.main();
                }
                
            }
            
        }
    } 
    static Scanner in = new Scanner(System.in);
    
    void staff()
    {
        
    }
    static void menu() throws InterruptedException
    {
        int input;
        do 
        {
            System.out.println("Logging in ....");
            Thread.sleep(1000);
            System.out.println("");
            System.out.println("\n1.View All Users"
                             + "\n2.Print All Parked Vehicles "
                             + "\n3.View All Vehicles"
                             + "\n4.View Available Parking"
                             + "\n5.Exit ");
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
                    
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    
            }
        } while (true);
        
    }
   
}
