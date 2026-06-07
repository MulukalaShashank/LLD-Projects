package FStrategy;
import java.util.*;

public abstract class Data implements Map{
  
	public static class City{
		int city;
		int dist;
		
		City(int c, int d)
		{
			this.city = c;
			this.dist = d;
		}
	}
	
	public abstract int short_dis(String s, String d);
    HashMap<String, Integer> map = new HashMap<>();
    static ArrayList<ArrayList<City>> graph = new ArrayList<>();
    int v = 6;
    
    
    Data()
    {
    	map.put("Delhi", 0);
    	map.put("Hyderabad", 1);
    	map.put("Mumbai", 2);
    	map.put("Pune", 3);
    	map.put("Kashmir", 4);
    	map.put("Pahelgam", 5);
    	
    	for(int i=0; i<v; i++)
    	{
    		graph.add(new ArrayList<>());
    	}
    	
    	add(0, 1, 1000);
    	add(0, 2, 550);
    	add(2, 3, 250);
    	add(3, 1, 500);
    	add(3, 4, 2000);
    	add(0, 4, 300);
    	add(4, 5, 50);
    }
    static void add(int s, int d, int w)
	{
		graph.get(s).add(new City(d, w));
		graph.get(d).add(new City(s, w));
	}
    
    
     
  
	
}
