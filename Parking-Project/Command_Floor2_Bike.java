package Parking;

public class Command_Floor2_Bike implements Command{
	   
	Long l;
	Floor_2 ref;
	Factory_Vehicle b;
	Vehicle_Type bike;
	
	Command_Floor2_Bike(Long l)
	{
		this.l = l;
		this.b = new Factory_Vehicle();
		this.bike = b.get_veh("bike" ,l); 
		this.ref = new Floor_2(bike);
	}
   public void execute()
   {
	 boolean b =  ref.bike_add();
	 if(b)
	 {
		System.out.println("Ticket generated for Bike: "+ this.l);
	 }
   }
   public void cost()
   {
	   try
	   {
	   System.out.println("Total cost for parking is: "+ref.remove_bike(bike));
	   }
	   catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }
	}
}
