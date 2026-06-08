package Facade;

public class start implements Facade{
	StreamingServer ref1;
	AuthenticationService ref2;

	start()
	{
		  this.ref1 = new StreamingServer();
	      this.ref2 = new AuthenticationService();
	}
	 public void start()
     {
         ref2.as();
         ref1.ss();
     }
	 
}
