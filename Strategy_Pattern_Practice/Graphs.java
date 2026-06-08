package StrategyPract;
import java.util.*;

class Pair{
	int dest;
	int wei;
	
	Pair(int d, int w)
	{
		this.dest=d;
	    this.wei=w;
	}
}
class Edge{
	int sou;
	int wei;
	
	Edge(int s, int w)
	{
		this.sou=s;
	    this.wei=w;
	}
}
public class Graphs {
   
	int v;
	ArrayList<ArrayList<Pair>> graph;
	
	Graphs(int v)
	{
		this.v = v;
		this.graph = new ArrayList<>();
		
		for(int i=0; i<v; i++) graph.add(new ArrayList<>());
	}
	
	void add(int s, int d, int w)
	{
		graph.get(s).add(new Pair(d, w));
		graph.get(d).add(new Pair(s, w));
	}
	
	void print()
	{
		for(int i =0; i<v; i++)
		{
			System.out.print(i +"--");
			ArrayList<Pair> li = graph.get(i);
			for (Pair nei : li) {
	            System.out.print(nei.dest + " (weight: " + nei.wei + ") ");
	        }			
			System.out.println();
		}
	}
	int digi(int s, int d)
	{
		int[] dist = new int[v];
		Arrays.fill(dist,  Integer.MAX_VALUE);
		
		PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.wei, b.wei));
		pq.add(new Edge(0,0));
	    
	    while(!pq.isEmpty())
	    {
	    	Edge obj = pq.poll();
	    	int source = obj.sou;
	    	int wei = obj.wei;
	    	
	    	for(Pair nei : graph.get(source))
	    	{
	    		int dest = nei.dest;
	    		int nwei = nei.wei;
	    		if(source == d) break;
	    		
	    		if((wei + nwei)<dist[dest])
	    		{
	    			dist[dest] = wei + nwei;
	    			pq.add(new Edge(dest, dist[dest]));
	    		}
	    	}
	    	
	    }
	  return dist[d];
	
	}
	public static void main(String[] args) 
	{
	   Graphs obj = new Graphs(6);
	   
	   obj.add(0, 1, 10);
	   obj.add(0, 3, 20);
	   obj.add(1, 2, 30);
	   obj.add(3, 2, 10);
	   obj.add(3, 4, 5);
	   obj.add(2, 4, 5);
	   
	    obj.print(); 
	    
	    System.out.println("\n" + obj.digi(0, 2));
	    
	    
    }
}


















