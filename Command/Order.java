package Command;

public class Order implements Frontend{

    void Confirmed(String s)
    {
    	System.out.println("Your Order "+s+" has been confirmed!!!"); 	
    }
    void Cancelled(int s)
    {
    	System.out.println("Your Order "+s+"  has been Cancelled Successfully!!!");
    }
}
