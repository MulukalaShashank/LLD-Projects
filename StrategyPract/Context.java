package StrategyPract;

public class Context {
   Strategy ref;
   Context()
   {
	   
   }
   Context(Strategy obj)
   {
	   this.ref = obj;
   }
   public String get_time()
   {
	   return "The shortest time is :"+ ref.short_time();
   }
  
}
