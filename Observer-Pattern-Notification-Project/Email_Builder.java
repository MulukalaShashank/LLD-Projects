package Notification;

public class Email_Builder implements E_Subject, E_Recipient, Email_Optional{
     String sub;
     String rec;
     String  att;
     int s_pri;
     int e_pri;
     Long date;
     
     public E_Recipient subject(String s)
     {
    	 this.sub = s;
    	 return this;
     }
     public Email_Optional recipient(String er)
     {
    	this.rec = er;
    	return this;
     }

     
     //Email Optionals
    public  Email_Optional attachments(String a)
    {
    	this.att = a;
    	return this;
    }
    public  Email_Optional E_Priority(int p)
     {
    	this.e_pri = p; 
    	return this;
     }
     public Email_Optional schedule(Long l)
     {
    	 this.date = l;
    	 return this;
     }
     public Email e_build()
     {
    	 return new Email(this);
     }
     
     
	

     
}
