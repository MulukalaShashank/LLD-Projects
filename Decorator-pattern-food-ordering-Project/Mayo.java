package Decorator;

public class Mayo extends Extra_item{
   Mayo(Base obj)
   {
	   super(obj);
   }
  public String base_item()
   {
	   return obj.base_item()+"+Mayo";
   }
  public int cost()
  {
	  return obj.cost()+30;
  }
}
