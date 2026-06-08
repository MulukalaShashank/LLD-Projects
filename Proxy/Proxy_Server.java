package Proxy;

public class Proxy_Server implements Database{
   
	String name;
	boolean val;
	Server ref;
	
	Proxy_Server(String name)
	{
		this.name = name;
	}
	boolean check()
	{
		this.val = this.name.equals("admin") ? true : false;
		return this.val;
	}
	
	
	public void put(int num, String name)
	{
		if(this.check())
		{
			if(this.ref == null)
			{
				this.ref = new Server();
			}
			this.ref.put(num, name);
		}
		else
		{
			System.out.println("user don't have acces");
		}
	}
	public void remove(int num)
	{
		if(this.check())
		{
			if(this.ref == null)
			{
				this.ref = new Server();
			}
			this.ref.remove(num);
		}
		else
		{
			System.out.println("user don't have acces");
		}
	}
	public String getfile(int num)
	{
		if(this.ref == null)
		{
			this.ref = new Server();
		}
		return this.ref.getfile(num);
	}
}
