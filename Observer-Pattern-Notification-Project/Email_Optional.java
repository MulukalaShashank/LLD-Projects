package Notification;

public interface Email_Optional {
    Email_Optional attachments(String a);
    Email_Optional E_Priority(int p);
    Email_Optional schedule(Long l);
    Email  e_build();
}
