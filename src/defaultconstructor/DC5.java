package defaultconstructor;

public class DC5 
{
	// Use ---------> to copy or/load all the member of class into object
	
	
	public static void main(String[] args) 
	{   // non static method call fron same class
		
		DC5 O1=new DC5();
		O1.K2();
		//DC5 ----> classname ------> datatype
		// O1 ------> object name -> to identify /refer object
		//new -> keyword ------use to create an empty object
		//  DC5 ---> classname() ---> constructor call
				
	}
	
	public void K2() 
	{
		System.out.println("hello");
	}
}
