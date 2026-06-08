package Parking;

public class Command_Display implements Command{

	Display ref;
	Command_Display()
	{
		this.ref = new Display();
	}
	public void execute()
	{
		ref.f1_bike();
		ref.f1_car();
		ref.f2_bike();
		ref.f2_car();
	}
	public void cost()
	{
		System.out.println("No tickets have been sold");
	}
}
