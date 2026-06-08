package AbstractFactory;

public class Dark  implements AbstractFactory{
	   public Button bc()
	   {
		   return new Dark_Button();
	   }
	   
	   public Textbox tb()
	   {
		   return new Dark_Box();
	   }
	}

