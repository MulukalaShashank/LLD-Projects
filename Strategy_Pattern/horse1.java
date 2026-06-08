package Strategy;

public class horse1 
{
   public static void main(String[] args) {
	   
	Context obj = new Context();
	obj.set_fly(new Horse_Fly());
	obj.set_run(new Horse_Run());
	obj.run();
	obj.fly();
   
   }
}
