package Proxy;

public class Client {
	public static void main(String[] args) {
		
      Database obj = new Proxy_Server("admin");
      obj.put(1, "The Story of my Life - Helen Keller");
      obj.put(2, "The Secret");
      obj.put(3, "The Way to home");
      System.out.println("-------------");
      
      System.out.println(obj.getfile(1));
      System.out.println("------------");
      
      Database obj1= new Proxy_Server("user");
      obj1.put(2, "The Heaven");
      System.out.println("-------------");
      
      obj.remove(3);
      System.out.println("------------");
      
    System.out.println("Admin :"+ obj.getfile(1));
    System.out.println("User : " +obj1.getfile(1));
    obj1.remove(1);
    
    
      



	}
}
