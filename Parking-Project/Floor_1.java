package Parking;

import java.time.Duration;
import java.time.LocalTime;

public class Floor_1 implements Floor, Database{
    
	Vehicle_Type obj;
	int bcount;
	int ccount;
	
	Floor_1(Vehicle_Type obj)
	{
		this.obj = obj;
	}
	boolean bike_add()
	{
		this.bcount = 50-Database.f1_Bike.size();
		if(bcount>0)
		{
			Database.f1_Bike.put(obj, LocalTime.now());
			return true;
 		}
		else
		{
			System.out.println("All slots are Booked!!!"+"\n"+"Please choose different floor");
			return false;
		}
	}
	boolean car_add()
	{
		this.ccount = 50-Database.f1_Car.size();
		if(ccount>0)
		{
			Database.f1_Car.put(obj, LocalTime.now());
			return true;
		}
		else
		{
			System.out.println("All slots are Booked!!!"+"/n"+" Please choose different flooe");
			return false;
		}
	}
	double remove_bike(Vehicle_Type obj)
	{
		this.obj = obj;
		if(!Database.f1_Bike.containsKey(obj))
		{
			throw new IllegalArgumentException("Ticket was not taken");
		}
		else
		{
			LocalTime t1 = Database.f1_Bike.get(obj);
			LocalTime t2 = LocalTime.now();
			Double time = (double)Duration.between(t1, t2).getSeconds();
			System.out.println("Bike Parked from : "+t1);
			System.out.println("Bike Parked To : "+t2);
			Database.f1_Bike.remove(obj);
			return time*100;
		}
	}
	
	double remove_car(Vehicle_Type obj)
    {
	   this.obj = obj;
	   if(!Database.f1_Car.containsKey(obj))
	   {
			throw new IllegalArgumentException("Ticket was not taken");
	   }
	   else
	   {
		   LocalTime t1 = Database.f1_Car.get(obj);
		   LocalTime t2 = LocalTime.now();
		   Double cost = (double)Duration.between(t1, t2).toHours();
		   System.out.println("Car Parked from : "+t1);
		   System.out.println("Car Parked To : "+t2);
		   Database.f1_Car.remove(obj);
		   return cost*100;
	   }
    }
}
















