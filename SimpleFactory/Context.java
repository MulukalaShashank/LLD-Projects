package SimpleFactory;

public class Context {
    Factory getNotification(String not)
    {
    	if(not.equalsIgnoreCase("EMAIL"))
    	{
    		return new EMail();
    	}
    	else if(not.equalsIgnoreCase("SMS"))
    	{
    		return new SMS();
    	}
    	else if(not.equalsIgnoreCase("PUSH"))
    	{
    		return new PUSH();
    	}
    	throw new IllegalArgumentException("Error: Invalid Input");
	    	
    }
}
