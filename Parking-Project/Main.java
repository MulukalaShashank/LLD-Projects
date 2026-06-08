package Parking;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class Main {
	Invoker obj;
	synchronized void check()
	{
		this.obj = new Invoker();      
		obj.start();    //Checking Slots
		System.out.println("--------------------------------");
	}
	
	void add(Command cmd)
	{
		   obj.set_state(cmd);
		   obj.start();
		   System.out.println("-------------------");
	}
	
	void remove(Command cmd)
	{
		obj.set_state(cmd);
		obj.cost();
		System.out.println("----------------------------");
	}
   public static void main(String[] args) throws InterruptedException 
	 {  
	   Main access = new Main();
	   access.check();
	   
	   Command bike1 = new Command_Floor1_Bike(123L);
	   access.add(bike1);
       access.check();
       

	   Command car1 = new Command_Floor1_Car(753L);
	   access.add(car1);
	   access.check();
       
	   Command bike2 = new Command_Floor2_Bike(456L);
	   access.add(bike2);
	   access.check();
	   
	   Command car2 = new Command_Floor2_Car(753L);
	   access.add(car2);
	   access.check();
	   
	   
	   




	 
     	   
     }
}
