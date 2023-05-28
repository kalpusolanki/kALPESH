package globlvarible;


public class globalvrblSampl1 
{
  static int a = 25;
  int b= 50;
  
  public static void main(String[] args) 
  {
	System.out.println(a);       //static variable call directly in printing statement of same class
 
	globalvrblSampl1 O1 = new globalvrblSampl1();
  System.out.println(O1.b);       //non static variable call through object in printing statement of same class
     O1.K1();                    // We create an object for non static method call, also we use same object of same class
      K2();                      //we call static method directly in main method
      
     
      System.out.println(Smaple2diffclass.c);  //static global variable call from diff class.
      
     
      Smaple2diffclass.K4();                          //static method call from diff calss
      
      
      Smaple2diffclass O3 =new Smaple2diffclass();   //non static global variable call from diff class using object
      System.out.println(O3.d); 
      O3.K3();                                        // non static method call from diff class as creating same object as previous upper.
  }
	
	public void K1()
	{
		System.out.println(a);         //static variable call directly in printing statement of same class    // because indirectly we create object for non static method calling
	
	    System.out.println(b);         //non static variable call through non static method directly.

	}
	
	public static void K2() 
	{
		System.out.println(a); //static variable call directly in printing statement of same class
	  
		globalvrblSampl1 O2 =new globalvrblSampl1();   // non static variable call through other object in static method.
		System.out.println(O2.b);
	
	}		
}
