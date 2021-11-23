import java.util.*;
public class Admin {
    static Scanner scan=new Scanner(System.in);
    private static int num=0;
    private static ArrayList<Airport> cityList=new ArrayList<Airport>(num);
    Admin(){
        System.out.println("Choose the number corresponding to the respective option:");
        System.out.println("1. Proceed with default settings.");
        System.out.println("2. Customize settings.");
        int n=scan.nextInt();scan.nextLine();
        if(n==2){
            //custom settings...
        }
        else{
            System.out.println("Program now executes with default settings");
        }
    }
}

