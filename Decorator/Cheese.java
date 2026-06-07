package Decorator;

public class Cheese extends Extra_item{
	
	Cheese(Base obj)
	{
		super(obj);
	}
      
	public String base_item()
	{
		return this.obj.base_item()+"+Cheese";
	}
	public int cost()
	{
		return this.obj.cost()+20;
	}
}
