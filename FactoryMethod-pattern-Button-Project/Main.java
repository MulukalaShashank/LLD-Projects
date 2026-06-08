package FactoryMethod;
import java.util.*;

public class Main {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter OS type");
	String s = sc.next();
	
	Dialogue obj =  new Windowtype();
	try {
	Buttons b = obj.type(s);
	b.button();
	
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
}
}
