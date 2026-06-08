package Parking;

public class Invoker {
   Command state;
   Invoker()
    {
    	this.state = new Command_Display();
    }
    void set_state(Command state)
    {
    	this.state = state;
    }
    
    void start()
    {
    	this.state.execute();
    }
    void cost()
    {
    	this.state.cost();
    }
	
}
