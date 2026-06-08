package SimpleFactory;

public class PUSH implements Factory{
   public void notification(String msg)
   {
	   System.out.println("Sending PUSH Notification: "+msg);   }
}
