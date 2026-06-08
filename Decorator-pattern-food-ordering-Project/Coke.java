package Decorator;

public class Coke extends Extra_item{
	
	Coke(Base obj)
	{
		super(obj);
	}
      
	public String base_item()
	{
		return this.obj.base_item()+"+Coke";
	}
	public int cost()
	{
		return this.obj.cost()+30;
	}
}
