package Notification;

public class Client {
   public static void main(String[] args) {
	 SMS ref = SMS.get().subject("Request for leave")
			 .recipient("shashank@123.com")
			 .Emoji("🚩🚩🚩")
			 .s_build();
   ref.start();
   System.out.println("--------------------------");
   
   Email e = Email.get().subject("Request for Leave")
		   .recipient("vishnu@32.com")
		   .E_Priority(1)
		   .attachments("Leave.docs")
		   .schedule(25_05_2026L)
		   .e_build();
   e.start();
   }   
}
