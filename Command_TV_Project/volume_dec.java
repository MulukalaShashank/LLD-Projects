package Command_TV;

public class volume_dec implements Command{
    TV ref;
    volume_dec(TV obj)
    {
   	 this.ref = obj;
    }
   public void run()
    {
   	 ref.volume_down();
    }
}
