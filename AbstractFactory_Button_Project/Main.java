package AbstractFactory;
import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter theem");
	String theme = sc.next();
	
	AbstractFactory ab = null;
	if(theme.equalsIgnoreCase("dark"))
	{
	   	ab = new Dark();
	}
	else if(theme.equalsIgnoreCase("light"))
	{
	   	ab = new Light();
	}
	else
	{
		System.out.println("Invalid Input");
	}
	try {
	Button b = ab.bc();
	Textbox tb = ab.tb();
	
	b.click();
	tb.box();
	}
	catch(Exception e){
		System.out.println("Error: Cannot Proceed Further");
	}
	
     
}
}
