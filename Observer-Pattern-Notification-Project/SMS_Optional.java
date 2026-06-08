package Notification;

public interface SMS_Optional {
   
   SMS_Optional Emoji(String emo);
   SMS_Optional S_Priority(int p);
   SMS s_build();
}
