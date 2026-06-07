package FStrategy;
import java.util.*;

public class Main {
	public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Source");
	String source = sc.next();
	
	System.out.println("Enter Destination");
	String destination = sc.next();
	
	Context obj = new Context();
	obj.set(new Short());
	obj.get(source, destination);
	
	
	
	
	 
	
    }
}
