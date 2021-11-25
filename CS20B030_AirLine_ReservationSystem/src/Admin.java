import java.util.*;
public class Admin {
    static Scanner scan=new Scanner(System.in);
    private static int num=5;
    private static ArrayList<Airport> cityList;
    Admin(){
        System.out.println("Choose the number corresponding to the respective option:");
        System.out.println("1. Proceed with default settings.");
        System.out.println("2. Customize settings.");
        int n=scan.nextInt();scan.nextLine();
        if(n==2){
            //custom settings...
            System.out.println("Enter the number of cities ");
            int k=scan.nextInt();scan.nextLine();
            cityList=new ArrayList<Airport>(k);
            for(int i=0;i<k;i++){
                
            }
        }
        else{
            System.out.println("Program now executes with default settings");
        }
    }
}

