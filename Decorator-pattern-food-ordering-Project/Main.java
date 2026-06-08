package Decorator;

public class Main {
   public static void main(String[] args) {
	
	   Base obj = new Pizza();
	   System.out.println(obj.base_item()+"->"+obj.cost());
	   obj = new Coke(obj);
	   obj = new Fries(obj);
	   System.out.println(obj.base_item()+"->"+obj.cost());
}
}
