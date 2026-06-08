package AbstractFactory;

public class Light implements AbstractFactory{
   public Button bc()
   {
	   return new Light_Button();
   }
   
   public Textbox tb()
   {
	   return new Light_Box();
   }
}
