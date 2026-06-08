package Command_TV;

public class volume_inc implements Command{
     TV ref;
     volume_inc(TV obj)
     {
    	 this.ref = obj;
     }
    public void run()
     {
    	 ref.volume_up();
     }
}
