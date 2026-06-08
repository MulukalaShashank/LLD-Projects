package Command_Delivery;

public class Command_Cancel_Order  implements Command{
	Place_Order ref;
	
	
	Command_Cancel_Order(Place_Order obj)
	{
		this.ref = obj;
	}
   public void execute()
   {
	   ref.remove();
   }
}
