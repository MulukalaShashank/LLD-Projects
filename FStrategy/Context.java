package FStrategy;

public class Context {
  Map ref;
  
  
  
 void set(Map ref)
  {
	  this.ref = ref;
  }
  
  void get(String s, String d)
  {
	  System.out.println(ref.short_dis(s, d));
  }
}
