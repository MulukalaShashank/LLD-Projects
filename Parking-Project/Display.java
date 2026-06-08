package Parking;

public class Display implements Database{
    
	void f1_bike()
    {
	   int num = 50 - Database.f1_Bike.size();
       System.out.println("Floor 1 Bikes: "+num);	
    }
	void f2_bike()
	{
		 int num = 50 - Database.f2_Bike.size();
	     System.out.println("Floor 2 Bikes: "+num);	
	}
	void f1_car()
	{
		 int num = 50 - Database.f1_Car.size();
	     System.out.println("Floor 1 Cars:: "+num);	
	}
	void f2_car()
	{
		 int num = 50 - Database.f2_Car.size();
	     System.out.println("Floor 2 Cars:: "+num);	
	}
}
