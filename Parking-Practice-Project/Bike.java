package PracticeProjects;
import java.time.LocalTime;

public class Bike extends Database{

	void add(Long num, LocalTime t)
	{
		Bike_f1.put(num, t);
	}
	
}