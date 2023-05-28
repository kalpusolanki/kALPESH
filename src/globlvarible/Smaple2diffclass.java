package globlvarible;

public class Smaple2diffclass 
{
	static int c = 15;
	int d = 35;
	
	
         public void K3() 
        {
	System.out.println("K31");
	System.out.println(d);                      //   non static variable call directly in non static method
	System.out.println(c);                      //   static variable call directly in non static method
        	 
        }
         public static void K4() 
         {
			System.out.println("K41");
			
			Smaple2diffclass O3 =new Smaple2diffclass();  //non static global variable call create object in static method
			System.out.println(O3.d);
		
        	 System.out.println(c);                       //static global variable call directly in static method
		}
}
