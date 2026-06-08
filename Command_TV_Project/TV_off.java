package Command_TV;

public class TV_off implements Command{
    TV ref;
    TV_off(TV obj)
    {
   	 this.ref = obj;
    }
   public void run()
    {
   	 ref.off();
    }

}
