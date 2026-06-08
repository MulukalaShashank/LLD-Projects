package Notification;

public class SMS_Builder implements S_Subject, S_Recipient, SMS_Optional{
    String sub;
    String rec;
    String emo;
    int s_pri;
    
    
    public S_Recipient subject(String s)
    {
    	this.sub = s;
    	return this;
    }
    public SMS_Optional recipient(String sr)
    {   
     	this.rec = sr;
    	return this; 
    }
    
  //sms optional
    public SMS_Optional Emoji(String emo)
    {
   	 this.emo = emo;
   	 return this;
    }
    public SMS_Optional S_Priority(int p)
    {
   	 this.s_pri = p;
   	 return this;
    }
    public SMS s_build()
    {
   	 return new SMS(this);
    }
}