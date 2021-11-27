import java.util.*;
public class Payment {
    static Scanner scan=new Scanner(System.in);
    private static String acc="";
    private static int amt=0;
    Payment(User u,TicketBooking t){
        acc=u.getaccNum();
        //amt=total amount to be paid
        displayBill(u,t); // to display all the amount needed.
        payType(u,t);
    }
    // to check whether the user wants to continue with existing account or pay with a different account.
    static void payType(User u,TicketBooking t){
        System.out.println("Enter 1 if you want to continue your payment with the Account number: "+forloopx(acc.length()-4)+acc.substring(acc.length()-4));
        System.out.println("Enter 0 if you want to pay with a new Account.");
        int n=scan.nextInt();scan.nextLine();
        if(n==0){
            //paying with new Account number
            System.out.println("Enter your Account number with which you want to carry out the payment.");
            acc=scan.nextLine().trim();
            pay(u,t);
        }
        else {
            //paying with existing account number
        }
    }
    //method to format account number for privacy concerns
    static String forloopx(int n){
        String str="";
        for(int i=0;i<n;i++){
            str+="x";
        }
        return str;
    }
    static void pay(User u,TicketBooking t){
        //all payment functions
    }
    static void displayBill(User u,TicketBooking t){
        
    }
}
