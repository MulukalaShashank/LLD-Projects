package Parking;

public class Command_Floor1_Car implements Command{
	   
	    Long l;
		Floor_1 ref;
		Factory_Vehicle c;
		Vehicle_Type car;
		
		Command_Floor1_Car(Long l)
		{
			this.l = l;
			this.c = new Factory_Vehicle();
			this.car = c.get_veh("car", l); 
			this.ref = new Floor_1(car);
		}
	   public void execute()
	   {
		  boolean b = ref.car_add();
		  if(b)
		  {
			System.out.println("Ticket generated for Car: "+ this.l);
		  }
	   }
	   public void cost()
	   {
		   try
		   {
			   System.out.println("Total cost for parking is: "+ref.remove_car(car));
		   }
		   catch(Exception e)
		   {
		     System.out.println(e.getMessage()); 
		   }
		}
}
