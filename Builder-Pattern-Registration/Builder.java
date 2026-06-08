package PBuilder;

public class Builder implements name, phone, address, email, password, build{
   
	Real_Server ref;
	String name;
	Long ph;
	String ad;
	String em;
	String pas;
	
   public password name(String name)
   {
	  this.name = name;
	  return this;
   }
   public email password(String pass)
   {
	   this.pas = pass;
	   return this;
   }
   public phone email(String e)
   {
	   this.em = e;
	   return this;
   }
   public address phone(Long l)
   {
	   this.ph = l;
       return this;
   }
   public build address(String ad)
   {
	   this.ad = ad;
	   return this;
   }
   public Real_Server build()
   {
	   this.ref = new Real_Server(this);
	   return ref;
   }
}
