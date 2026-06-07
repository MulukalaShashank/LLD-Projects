package StrategyPract;
import java.util.*;
public class Main extends Context {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String name;
	String source;
	String dest;
	int veh;
	
	System.out.println("Enter user name");
	name = sc.next();
	System.out.println("Enter Source");
	source = sc.next();
	System.out.println("Enter Destination");
	dest = sc.next();
	System.out.println("Choose Vehicle: \n 1.Car \n 2.Bike");
	veh = sc.nextInt();
	
	Context obj = new Context(new Hyderabad(veh));
	System.out.println("Hi"+ name);
    System.out.println(obj.get_time());	
	
	
}
}
