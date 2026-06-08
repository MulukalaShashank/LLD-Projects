package Command;

public class Main {
  public static void main(String[] args) {
	
	  Frontend or = new Order();
	  Frontend his = new History();
	  Command o1 = new Command_order((Order)or, "Burger", 0, (History)his);
	  o1.execute();
	  
	  Command o2 = new Command_History((History)his, "Burger", 0);
	  o2.execute();
	  
}
}
