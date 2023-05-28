package defaultconstructor;

public class DC3 
{
	// Use -----> to copy or/load all the member of class into object
	

	public static void main(String[] args) 
	{
		DC3 O1 =new DC3();            // non static method call from same class
		O1.add(2,5);
		
		O1.Sub (6,5);
		
		//DC3 ---> class name ---. datatype
		//O1 ---->  object name -> to identify /refer object
		// new -> keyword -----> use to create an empty object
		//DC3() ----> class name() -----> constructor call
		
		
		//  non static method call from diff class
		
		Dc4 O2 =new Dc4();
		O2.Mul(6,8);
		
		// Dc4 -----> class name --->datatype
		// O2 ------> object name ----> to identify/refer object
		// new ----> keyword ------>  use to create an empty object
		// Dc4() -----> classname() -----> constructor call
		
	}
	
	
	public void add(int a,int b) 
	{
		System.out.println(a+b);
	}
	public void Sub(int c,int d)
	{
		System.out.println(c-d);
	}
}
