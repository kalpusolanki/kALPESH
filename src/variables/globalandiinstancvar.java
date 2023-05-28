package variables;

public class globalandiinstancvar
{


	int num1=10;                             ///global variable
	 
	public static void main(String[] args)
	{
	                           // instance variable
		
	globalandiinstancvar F1 =new globalandiinstancvar();
	globalandiinstancvar F2 = new globalandiinstancvar();
	F2.num1=10000;                 // reinitialize the global variable by creating object
	globalandiinstancvar F3= new globalandiinstancvar();
	F3.num1=250;


	       // F1.num1;
		
		System.out.println(F1.num1);
	System.out.println(  F2.num1);
	System.out.println(F3.num1);
	
	//System.out.println(num1);  // non static global variable not used in static regular method, we need to create object
	}
	
	
	public static void M2() 
	{
		globalandiinstancvar F5 = new globalandiinstancvar();
		System.out.println(F5.num1);  // non static global variable not used in static regular method, we need to create object
	}
	public void M3() 
	{
		System.out.println(num1); // non static global variable used in non static regular method directly
	}
}
