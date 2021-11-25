import java.util.*;
class arraylist{
    static ArrayList<User> customer = new ArrayList<>();
}
public class Menu extends arraylist{
    static Scanner scan=new Scanner(System.in);
    
    Menu(){
        //System.out.println("fdgh");
        display();
    }
    void display(){
        System.out.println("Displaying Funtions...");
        System.out.println("1. New User - Creates new Account.");
        System.out.println("2. Existing User - Proceeds with Booking Process.");
        System.out.println(". Exit Program.");
        int n=scan.nextInt();
        if(n==1){
            System.out.println("Starting process for creating New Account.");
            newAccount();
        }
        else if(n==2){
            //verify existing or not
            System.out.println("Starting the Booking Process.");
        }
        else {
            System.out.println("Terminating Program...");
            System.exit(0);
        }
    }
    static void newAccount(){
        //create new Account
        User c=new User();
        customer.add(c);
    }
}