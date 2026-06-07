package Decorator;

public class Fries extends Extra_item{
	
	Fries(Base obj)
	{
		super(obj);
	}
      
	public String base_item()
	{
		return this.obj.base_item()+"+Fries";
	}
	public int cost()
	{
		return this.obj.cost()+50;
	}
}
