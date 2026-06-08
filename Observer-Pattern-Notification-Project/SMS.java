package Notification;

public class SMS implements Channel{
	  
		private String sub;
		private String rec;
		private String emo;
		private int pri;
	    
	  SMS(SMS_Builder obj)
	  {
		 this.sub = obj.sub;
		 this.rec  = obj.rec;
		 this.pri = obj.s_pri;
		 this.emo = obj.emo;
	  }
	  public void start()
	  {
		  System.out.println("SMS is sent Successfully with the following details");
		  System.out.println("Subject: "+sub);
		  System.out.println("To: "+rec);
		  System.out.println("Suubject: "+sub);
		  System.out.println("Emoji: "+emo);  
	  }
	  public static SMS_Builder get()
	  {
		  return new SMS_Builder();
	  }
	}