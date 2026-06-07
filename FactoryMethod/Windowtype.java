package FactoryMethod;

public class Windowtype implements Dialogue{
  public Buttons type(String s)
  {
	  if(s.equalsIgnoreCase("windows"))
	  {
		  System.out.println("Rendering Windows Dialog");
		  return new Windows();
	  }
	  throw new IllegalArgumentException("Error: Unsupported Operating System");
  }
}
