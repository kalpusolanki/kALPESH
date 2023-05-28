package this_super;

public class SubClass extends SuperClass
{
	 String name="hanuman";
	   public static void setName(String name) 
	   {
	      this.name = name;
//	      Where the "super" keyword in Java is used as a reference to the object of the superclass. This implies that to use "super" the method should be invoked by an object, which static methods are not.
//
//	      Therefore, you cannot use the "super" keyword from a static method.
	   }
	   public void display() 
	   {
	      System.out.println("name: "+super.name);
	   }
	   public static void main(String args[]) 
	   {
	      new SubClass().display();
	   }
}
