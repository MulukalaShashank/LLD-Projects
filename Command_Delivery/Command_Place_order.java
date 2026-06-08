package Command_Delivery;

public class Command_Place_order implements Command{
	Place_Order ref;
	
	
	Command_Place_order(Place_Order obj)
	{
		this.ref = obj;
	}
   public void execute()
   {
	   ref.add();
   }


}
