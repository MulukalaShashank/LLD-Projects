package URL_Project;
import java.util.*;

public  class url_shortner {
	private static final String BASE62 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	int count = 1;
	
    protected HashMap<String, String> url = new HashMap<>(); //for link
    
    String encode(String longlink)
    {
        int num = count++;
        StringBuilder sb = new StringBuilder();
    	
        while(num>0)
    	{
    		sb = sb.append(BASE62.charAt(num%62));
    		num = num/62;
    	}
    	String shorturl = sb.reverse().toString();
        url.put(shorturl, longlink);
        return "https://"+shorturl;
    }
    
    String decode(String link)
    {
    	String shorturl = link.substring(link.lastIndexOf("/")+1);
        return url.get(shorturl);
    }
}
