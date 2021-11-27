import java.util.*;
public class AirLineReservationSystem {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
     

        System.out.println("Welcome to the Air Line Reservation System!!!");
        System.out.println("1. GO with predefined flight, destination and seating settings.");
        System.out.println("2. Define customised flight, destination and seating settings as ADMIN.");
        System.out.println("3. Exit Program.");
        System.out.print("Choose the number corresponding to the options given:");
        int choice=scan.nextInt();
        System.out.println();
        if(choice==1){
            //System.out.println("ddd");
            Menu m=new Menu();
        }
        else if(choice==2){
            //System.out.println("aaa");
            Menu m=new Menu();
        }
        else if(choice==3){
            System.out.println("Terminating program...");
            System.exit(0);
        }
        else{
            System.out.println("You have chosen the wrong input...\nProceeding with the default settings");
        }
        // display Menu-> it has all necessary functionalities of air line system.
        scan.close();
    }
} 
