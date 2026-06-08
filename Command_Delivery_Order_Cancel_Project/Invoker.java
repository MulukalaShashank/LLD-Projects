package Command_Delivery;
import java.util.*;
import java.util.Map.Entry;

public class Invoker {
	
  Command ref;
  Invoker(Command obj)
  {
	  this.ref = obj;
  }

  void start()
  {
	  ref.execute();
  }
}
