package PState;

public class HasATM implements ATM{
    public void insertATM(Context ref)
    {
   	 System.out.println("ATM already inserted");
    }
    public void enterpassword(Context ref)
    {
   	 System.out.println("Password is entered");
   	 ref.set_state(new Withdraw());
    }
    public void enter()
    {
      	 System.out.println("Please enetr your password");
    }
}