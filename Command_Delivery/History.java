package Command_Delivery;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class History {
  
	  protected static Map<String, String> map = new LinkedHashMap<>();
	  
	  void history()
	  {
		  for(Entry<String, String> x: map.entrySet())
		  {
			  System.out.println(x.getKey()+" "+x.getValue());
		  }
	  }
}
