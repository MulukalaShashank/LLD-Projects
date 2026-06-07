package SimpleFactory;

public class EMail implements Factory{
     public void notification(String msg)
     {
    	 System.out.println("Sending Email Notification: "+msg);
     }
}
