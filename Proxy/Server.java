package Proxy;
import java.util.*;

public class Server implements Database{

 
  static HashMap<Integer, String> map = new HashMap<>();  

   Server()
   {
	   load();
   }
   public String getfile(int s)
   {
	   return map.get(s);
   }
   public void put(int num, String name)
   {
	   map.put(num, name);
	   System.out.println("Succesfully added "+name);
   }
   public void remove(int num)
   {
	   String rem = getfile(num);
	   map.remove(num);
	   System.out.println("Succesfully removed "+ rem);

   }
   public void load()
   {
	   System.out.println("Loading");
   }
}
