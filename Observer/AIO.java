package Observer;

public class AIO implements Notification{
	String name;
	
    AIO(String s)
    {
    	this.name = s;
    }
	
     public void update(String old_state, String new_state)
     {
    	 System.out.println(name + ":- Product state has been changed from "+old_state+" to "+new_state);
     }
}
