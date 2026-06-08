package Command;
import java.util.*;

public class History implements Frontend{
	ArrayList<String> list = new ArrayList<>();
     
     void history()
     {
    	for(String q : list)
    	{
    		System.out.println(q);
    	}
     }
     void add_order(String s)
     {
    	 list.add(s);
     }
     void remove_order(int a)
     {
    	 list.remove(a);
     }
}
