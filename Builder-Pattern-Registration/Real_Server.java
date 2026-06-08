package PBuilder;

public class Real_Server {
	
	String name;
	Long ph;
	String ad;
	String em;
	String pas;
	
	Real_Server(Builder b)
	{
	   this.name = b.name;
	   this.pas = b.pas;
	   this.ph = b.ph;
	   this.ad = b.ad;
	   this.em = b.em;
	}
	void start()
	{
	   	System.out.println(name);
	   	System.out.println(pas);
	   	System.out.println(em);
	   	System.out.println(ph);
	   	System.out.println(ad);
	}
}
