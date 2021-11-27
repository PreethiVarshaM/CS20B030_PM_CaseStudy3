import java.util.*;
public class TicketBooking {
    static Scanner scan=new Scanner(System.in);
    private static String DepCity="",ArrCity="",DepDate="",ArrDate="",round_1way="";

    TicketBooking(){
        setDepCity();;
        setArrCity();
        setDepDate();
        setArrDate();
        setRound_1way();
        
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
    static void setRound_1way(){
        System.out.println("Enter 1 for a round trip.");
        System.out.println("Enter 2 for a one way trip");
        round_1way=scan.nextLine().trim();
    }
    static String getRound_1way(){
        return round_1way;
    }
}
class GenerateTicket extends TicketBooking{
    static void GenTicket(){
    //display booked ticket in a formatted way
    }
}
