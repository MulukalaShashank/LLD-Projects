package StrategyPract;

public class Hyderabad implements Strategy{
    int veh;
	int[] d = {100, 200, 650};
    
    Hyderabad(int a)
    {
    	this.veh = a;
    }
    public int short_time() {
    	if(veh==1)
    	{
    	  return calculate_car();
    	}
    	else
    	{
    		return calculate_bike();
    	}
    }
    public int calculate_car()
    {
    	int min = Integer.MAX_VALUE;
    	int time =0;
    	for(int i=0; i<d.length; i++)
    	{
    		time = d[i]/50;
    		if(min>time) min = time;
    	}
    	return min;
    }
    public int calculate_bike()
    {
    	int min = Integer.MAX_VALUE;
    	int time =0;
    	for(int i=0; i<d.length; i++)
    	{
    		time = d[i]/30;
    		if(min>time) min = time;
    	}
    	return min;
    }
   
}
