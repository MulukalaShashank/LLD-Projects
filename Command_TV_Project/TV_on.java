package Command_TV;

public class TV_on implements Command{
    TV ref;
    TV_on(TV obj)
    {
   	 this.ref = obj;
    }
   public void run()
    {
   	 ref.on();
    }

}
