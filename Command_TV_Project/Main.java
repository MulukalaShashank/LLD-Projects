package Command_TV;

public class Main {
   public static void main(String[] args) {
	
	   TV ref = new TV();
	   Command obj = new TV_on(ref);
	   Remote r = new Remote(obj);
	   r.start();
	   
	   Command obj1 = new TV_off(ref);
	   Remote r1 = new Remote(obj1);
	   r1.start();
	   
	   Command obj2 = new volume_inc(ref);
	   Remote r2 = new Remote(obj2);
	   r2.start();
	   
	   Command obj3 = new volume_dec(ref);
	   Remote r3 = new Remote(obj3);
	   r3.start();
	   
	   
	   
}
}
