package Command;

public class Kitchen implements Frontend{

	History h;
	Kitchen(History k)
	{
		this.h =h;
	}
	
	void start()
	{
	    while(!h.list.isEmpty())
	    {
	    	String o = h.list.get(0);
	    	System.out.println("Your Order "+o+" has been started");
	    	end(o);
	    }
	}
	void end(String o)
	{
    	System.out.println("Your order "+o+" has been completed");
	}
}
