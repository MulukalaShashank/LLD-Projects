package Command_Delivery;

import java.util.Map;

public class Place_Order {
   String name;
   String order;
   History inv;
   
   Place_Order(String name, String order, History inv)
   {
	   this.name = name;
	   this.order = order;
	   this.inv = inv;
   }
   
   void add()
   {
      inv.map.put(name, order);
      System.out.println(name + " your Order "+order+" has been placed");
   }
   void remove()
   {
	   inv.map.remove(name);
	   System.out.println(name + " your Order "+order+" has been cancelled");

   }
}
