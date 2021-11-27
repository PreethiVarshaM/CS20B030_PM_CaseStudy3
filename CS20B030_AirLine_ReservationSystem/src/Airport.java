import java.util.*;

public class Airport {
    static Scanner scan=new Scanner(System.in);
    private static String DoI="";//Domestic or international
    Airport(){

    }    
    static void setDOI(){
        System.out.println("Enter D if the Airport is Domestic");
        System.out.println("Enter I if the Airport is International");
        DoI=scan.nextLine().trim();
    }
    static String getDoI(){
        return DoI;
    }
}
