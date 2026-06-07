package Command;

public class Command_order implements Command{
	History h;
	Order obj;
	String s;
	int a;
	Command_order(Order obj, String s, int a, History h)
	{
		this.obj = obj;
		this.s = s;
		this.a = a;
		this.h = h;
	}
	public void execute()
	{
		obj.Confirmed(s);
    	h.add_order(s);
	}
	public void not_execute()
	{
		obj.Cancelled(a);
		h.remove_order(a);
	}
	
}
