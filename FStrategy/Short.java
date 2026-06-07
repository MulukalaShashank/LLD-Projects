package FStrategy;
import java.util.*;
public class Short extends Data
{
	static class Pair
	{
		int dest;
		int dist;
		
		Pair(int dest, int dist)
		{
			this.dest = dest;
			this.dist = dist;
		}
	}
  public int short_dis(String s, String d)
  {
	  //Dijikstra starts here
	  int source = map.get(s);
	  int destination = map.get(d);
	  
	  int[] km = new int[this.v];
	  Arrays.fill(km, Integer.MAX_VALUE);
	  
	  PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.dist-b.dist);
	  pq.add(new Pair(source,0));
	  
	  while(!pq.isEmpty())
	  {
		  Pair obj = pq.poll();
		  
		  int old_dis = obj.dist;
		  
		  if(obj.dest>km[obj.dest]) continue;
		  if(obj.dest == destination) break;
		  
		  for(City nei : graph.get(obj.dest))
		  {
			  int ncity = nei.city;
			  int ndist = nei.dist;
			  
			  if((old_dis + ndist) < km[ncity])
			  {
				  km[ncity] = old_dis + ndist;
				  pq.add(new Pair(ncity, km[ncity]));
			  }
		  }
		  
	  }
	  
	  
	  return km[destination];
  }
  
  
}
