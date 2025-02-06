package com.wipro.java.java8;

//1. Single abstract method
//2. @FunctionalInterface
//3. default or/and static 

@FunctionalInterface
interface TestInterface
{
    // only 1 abstract method
    public void circle(int a);
 
    // default method
    default String display(int a)
    {
      //System.out.println("Default Method Executed");
      return "1";
    }
    
    // default method
    default String circle1(int a)
    {
      //System.out.println("Default Method Executed");
      return "1";
    }
    
    //static method
    static String display()
    {
        return "Static Method Executed";
    }
 
  //static method
    static String display1()
    {
        return "Static Method Executed";
    }
}

	class ShapeInterface implements TestInterface
	{
	 
		// implementation of square abstract method
		  public void circle(int a)
		    {
		        System.out.println(a*a);
		    }
		  
		    public static void main(String args[])
		    {
		    	ShapeInterface c = new ShapeInterface();
		        c.circle(4);
		  
		        // default method executed
		        c.display(4);
		    }
	   
	}