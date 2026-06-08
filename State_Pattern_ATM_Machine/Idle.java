package PState;

public class Idle implements ATM{
     public void insertATM(Context ref)
     {
    	 System.out.println("ATM is inserted");
    	 ref.set_state(new HasATM());
     }
     public void enterpassword(Context ref)
     {
    	 System.out.println("Please insert your ATM card");
     }
     public void enter()
     {
    	 System.out.println("Please insert your ATM card");
     }
}
