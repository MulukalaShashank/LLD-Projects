package SimpleFactory;
import java.util.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the Notification type");
    String not = sc.next();
 
    sc.nextLine();
    System.out.println("Enter the Message");
    String msg = sc.nextLine();

    	Context con = new Context();
    	try {
    	Factory fac = con.getNotification(not);
    	fac.notification(msg);
    	}
    	catch (IllegalArgumentException e){
    		System.out.println(e.getMessage());
    	}
    }
}





