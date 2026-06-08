package Command;

public class Command_History implements Command{
    
	History obj;
	String s;
	int a;
	Command_History(History obj, String s, int a)
	{
		this.obj = obj;
		this.a = a;
		this.s = s;
	}
	public void execute()
	{
	    obj.history();	
	}
	public void command_add_order()
	{
		obj.add_order(s);
	}
	public void command_remove_order()
	{
		obj.remove_order(a);
	}
}
