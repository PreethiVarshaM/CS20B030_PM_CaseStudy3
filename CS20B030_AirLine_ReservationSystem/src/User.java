import java.util.*;
abstract class UserDetails extends arraylist{ 
    //acts as a skeletal structure for customer object to note different details
    static Scanner scan=new Scanner(System.in);
    private static String customerName="null",AadhaarNo="null",PhNum="null",pin="null", accNum="null",paddress="null",currentadd="null",occupation="null",passnum="null",age="null",favSeat="null",BoE="null",gender="null";
    private static ArrayList<String> Members=new ArrayList<>();
    private static ArrayList<String> cities=new ArrayList<>();
    //setter methods for various customer details
    static void setName(){
        System.out.println("Enter your full Name: ");
        customerName=scan.nextLine().trim();
        System.out.println("Your name is set.");
    }
    static String getName(){
        return customerName;
    }
    static void setAadhaarNo(){
        System.out.println("Enter your Aadhaar Number: ");
        AadhaarNo=scan.nextLine().trim();
        System.out.println("Your Aadhaar Number is set.");
    }
    static String getAadhaar(){
        return AadhaarNo;
    }
    static void setPhNum(){
        System.out.println("Enter your phone number: ");
        PhNum=scan.nextLine().trim();
        System.out.println("Your Phone Number is set.");
    }
    static String getphnum(){
        return PhNum;
    }
    void setpin(){
        System.out.println("Enter your Pin (lessthan or equal than 5 characters): ");
        pin=scan.nextLine().trim();
    }
    // getter method for pin
    String getpin(){
        return pin;
    }
    static void setAccNum(){
        System.out.println("Enter your bank account number: ");
        accNum=scan.nextLine().trim();
        //System.out.println("Your bank account number is set.");
    } 
    // getter method for account number 
    String getaccNum(){
        return accNum;
    }
    static void setAge(){
        System.out.println("Enter your age: ");
        age=scan.nextLine().trim();
    }
    static String getAge(){
        return age;
    }
    static void setGender(){
        System.out.println("Enter - F - if female, - M - if male, - O - if any other: ");
        gender=scan.nextLine().trim();
    }
    static String getGender(){
        return gender;
    }
    static void setpadderess(){
        System.out.println("Enter your permanent address: ");
        paddress=scan.nextLine().trim();
    }
    static String getpaddress(){return paddress;}

    static void setCurAddress(){
        System.out.println("Enter your current address: ");
        currentadd=scan.nextLine();
    }
    static String getCurAddress(){
        return currentadd;
    }
    static void setoccu(){
        System.out.println("Enter your occupation: ");
        occupation=scan.nextLine().trim();
    }
    static String getOccu(){
        return occupation;
    }
    static void setpassnum(){
        System.out.println("Enter your passport number: ");
        passnum=scan.nextLine().trim();
    }
    static String getpassnum(){
        return passnum;
    }
    static void setFavSeat(){
        System.out.println("Enter W for window seat\nEnter A for aisle seat\nEnter M for middle seat");
        favSeat=scan.nextLine().trim();
        //check for mistypes
    }
    static String getfavSeat(){
        return favSeat;
    }
    static void setBusOEco(){
        System.out.println("Enter B for Bussiness class preference\n Enter E for Economy class Preference");
        BoE=scan.nextLine().trim();
    }
    static String getBoE(){
        return BoE;
    }
    static void setmembers(){
        System.out.println("Enter the number of people that will associate with your travel:");
        int n=scan.nextInt();scan.nextLine();
        System.out.println("Creating new Account for your associates.");
        for(int i=0;i<n;i++){
            System.out.print("Name: ");
            String s=scan.nextLine().trim();
            Members.add(s);
            System.out.println("__Account__");
            Menu.newAccount();
            //search if name is in array list or not
            //customer.size();
        }
    }
    static void setcities(){
        System.out.println("Enter the number of cities you visit frequently: ");
        int n=scan.nextInt();scan.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("City Name: ");
            String s=scan.nextLine().trim();
            //search if there in admin - airport cities list or not
            cities.add(s);
        }
    }
}
//used abstraction to hide all the functionalities and procedure of user
public class User extends UserDetails{
    // constructor to allow for storing of user info when new customer object is created
    User(){
        setName();
        setAadhaarNo();
        setPhNum();
        setpin();
        setAccNum();
        setAge();
        setoccu();
        setCurAddress();
        setpadderess();
        setpassnum();
        setcities();
        setFavSeat();
        setmembers();
    }
}
