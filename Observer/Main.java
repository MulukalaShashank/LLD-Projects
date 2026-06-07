package Observer;

public class Main {
  public static void main(String[] args) {
	
	  Amazon az = new Server();
	  az.add("Shirt", "Confirmed", "Whatsup");	  
	  az.add("T-shirt", "Packed", "SMS");
	  az.change_state("Shirt", "Packed");
	  
}
}
