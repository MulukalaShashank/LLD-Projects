package PState;

public class Main {

	public static void main(String[] args) {
	
		Context obj = new Context();
	    obj.enter();
	    obj.password();
	    obj.insert();
	    System.out.println("---------------");
	    obj.insert();
	    obj.enter();
	    obj.password();
	    System.out.println("---------------");
	    obj.insert();
	    obj.password();
	    obj.enter();
	    
	}
}
