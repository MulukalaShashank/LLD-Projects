package Observer;
import java.util.*;

public class Server implements Amazon{
     
    HashMap<String, String> map = new HashMap<>();
    ArrayList<Notification> list = new ArrayList<>();
    
	public void change_state(String product, String state)
	{
	  if(map.containsKey(product))
	  {
		  String old_state = map.get(product);
		  map.put(product, state);
		  this.notifie(old_state, state);
	  }
	  else
	  {
		  System.out.println("Unable to change as there is no Product");
	  }
	}
	public void add(String p, String s, String e)
	{
		map.put(p, s);
	    list.add(new AIO(e));
	}
	public void remove(String s, String e)
	{
		map.remove(s);
	}
    public void notifie(String old_state, String new_state)
    {
      for(Notification n : list)
      {
    	  n.update(old_state, new_state);
      }
    }
}
