import java.util.*;
public class Flight {
    static Scanner scan=new Scanner(System.in);
    private static String to="",from="",arrival="",departure="",flightnum="";
    private static int fare=3000,jduration=60,numbclass=0,numseats=9,booked=0;
    private static boolean bclass=false;
    Flight(){
        set();
    }
    static void set(){
        System.out.println("Enter destination: ");
        to=scan.nextLine().trim();
        System.out.println("Enter Starting city: ");
        from=scan.nextLine().trim();
        System.out.println("Enter arrival time: ");
        arrival=scan.nextLine().trim();
        System.out.println("Enter departure: ");
        departure=scan.nextLine().trim();
        System.out.println("Enter flightnum: ");
        flightnum=scan.nextLine().trim();
        System.out.println("Enter seat fare: ");
        fare=scan.nextInt();scan.nextLine();
        System.out.println("Enter journey duration in minutes: ");
        jduration=scan.nextInt();scan.nextLine();
        System.out.println("Enter if bussiness class is available or not: ");
        bclass=scan.nextBoolean();scan.nextLine();
        System.out.println("Enter number of bussiness class seats: ");
        numbclass=scan.nextInt();scan.nextLine();
    }
    static void updatebooked(int n){
        booked+=n;
    }
    static int getbooked(){return booked;}
}
