package Command;

public class Command_Kitchen implements Command{
    Kitchen obj;
    
	Command_Kitchen(Kitchen obj)
    {
       this.obj = obj;
    }
	public void execute()
	{
		obj.start();
	}
}
