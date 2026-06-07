package Adaptor;

public class Adapter implements PaymentProcessor{
   
   Third_party obj;
   Adapter(Third_party obj)
   {
	   this.obj = obj;
   }
   
   public void pay(int a)
   {
	   this.obj.make_pay(a);
       System.out.println("Payment done using Standard Process and invoice is generated");

   }
   
}
