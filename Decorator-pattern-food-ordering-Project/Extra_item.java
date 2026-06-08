package Decorator;

public abstract class Extra_item implements Base{
       Base obj;
       Extra_item(Base obj)
       {
    	   this.obj = obj;
       }
}
