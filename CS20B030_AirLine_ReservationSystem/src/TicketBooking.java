import java.util.*;
public class TicketBooking {
    static Scanner scan=new Scanner(System.in);
    private static String DepCity="",ArrCity="",DepDate="",ArrDate="";

    TicketBooking(){
        setDepCity();;
        setArrCity();
        setDepDate();
        setArrDate();
    }
    static void setDepCity(){
        System.out.println("Enter the Departure city: ");
        DepCity=scan.nextLine().trim();
    }
    static String getDepCity(){
        return DepCity;
    }
    static void setArrCity(){
        System.out.println("Enter the Arrival city: ");
        ArrCity=scan.nextLine().trim();
    }
    static String getArrCity(){
        return ArrCity;
    }
    static void setDepDate(){
        System.out.println("Enter the Arrival city: ");
        DepDate=scan.nextLine().trim();
    }
    static String getDepDate(){
        return DepDate;
    }
    static void setArrDate(){
        System.out.println("Enter the Arrival city: ");
        ArrDate=scan.nextLine().trim();
    }
    static String getArrDate(){
        return ArrDate;
    }
}
class GenerateTicket extends TicketBooking{
    static void GenTicket(){
    //display booked ticket in a formatted way
    }
}
