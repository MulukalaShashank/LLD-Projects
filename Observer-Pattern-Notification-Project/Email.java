package Notification;

public class Email implements Channel{
  
	private String sub;
	private String rec;
	private String  att;
	private int pri;
	private Long date;
  
    
  Email(Email_Builder obj)
  {
	 this.sub = obj.sub;
	 this.rec  = obj.rec;
	 this.pri = obj.e_pri;
	 this.date = obj.date;
  }
  public void start()
  {
	  System.out.println("Email is sent Successfully with the following details:-");
	  System.out.println("Date: "+date);
	  System.out.println("Priority: "+pri);
	  System.out.println("To: "+rec);
	  System.out.println("Subject: "+sub);
	  System.out.println("Attachents: "+att);
	  
  }
  public static Email_Builder get()
  {
	  return new Email_Builder();
  }
}
