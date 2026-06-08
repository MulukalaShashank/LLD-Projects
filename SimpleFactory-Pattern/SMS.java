package SimpleFactory;

public class SMS implements Factory{
   
	public void notification(String msg)
    {
		System.out.println("Sending SMS Notification: "+msg);    }
}
