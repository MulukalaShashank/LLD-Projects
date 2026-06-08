package Command_TV;

public class Remote {
   Command obj;
   
   Remote(Command obj)
   {
	   this.obj = obj;
   }  
   
   void start()
   {
	   obj.run();
   }
}
