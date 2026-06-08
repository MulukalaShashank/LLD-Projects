package Command_Delivery;

public class Main {
  public static void main(String[] args) {
	
	  History  his = new History();
	  Place_Order obj = new  Place_Order("Shashank", "chocolate", his);
      Command ref = new Command_Place_order(obj);  
      Invoker r = new Invoker(ref);
      r.start();
      his.history();
      
	  History  his1 = new History();
      Place_Order obj1 = new  Place_Order("Rahul", "Pizza", his1);
      Command ref1 = new Command_Place_order(obj1);  
      Invoker r1 = new Invoker(ref1);
      r1.start();
      his1.history();
      
      History  his3 = new History();
      Place_Order obj3 = new  Place_Order("Rahul", "Burger", his3);
      Command ref3 = new Command_Place_order(obj3);  
      Invoker r3 = new Invoker(ref3);
      r3.start();
      his3.history();
      
      History his2 = new History();
      Command c = new Command_Cancel_Order(new Place_Order("Rahul", "Pizza", his2));
      Invoker s = new Invoker(c);
      s.start();
      his2.history();
    
  
      
      
  }
}
