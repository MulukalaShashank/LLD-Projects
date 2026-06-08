package Parking;

public class Factory_Vehicle {
     
	public Vehicle_Type get_veh(String s, Long num)
	{
		if(s.equalsIgnoreCase("BIKE"))
		{
			return new Bike(2, num);
		}
		else
		{
		    return new Car(4, num);	
		}

	}
}
