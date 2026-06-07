package Adaptor;

public class Client {
   public static void main(String[] args) {
	   
	   Third_party t = new Razro();
	   PaymentProcessor obj = new Adapter(t);
	   
	   obj.pay(1000);
}
}
