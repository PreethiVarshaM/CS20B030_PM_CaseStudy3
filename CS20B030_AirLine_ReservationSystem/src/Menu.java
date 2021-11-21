import java.util.*;
public class Menu {
    static Scanner scan=new Scanner(System.in);
    static ArrayList<User> customer = new ArrayList<>();
    Menu(){
        display();
    }
    void display(){
        System.out.println("Displaying Funtions...");
        System.out.println("1. New User - Create new Account.");
        System.out.println("2. ");
        System.out.println(". Exit Program.");
        int n=scan.nextInt();
        if(n==1){
            System.out.println("Starting process for creating New Account.");
            newAccount();
        }
        else if(n==2){
            System.out.println();
        }
        else {
            System.out.println("Terminating Program...");
            System.exit(0);
        }
    }
    void newAccount(){
        //create new Account
        User c=new User();
                User.add(c);
    }
}