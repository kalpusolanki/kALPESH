package defaultconstructor;

public class DC1 
{
	//default constructor provided by compiler
	
	// to copy or/load all the member of class into object
	
	
	//Default constructor()         class name()
	//{
		
	//}
	
	
	
public static void main(String[] args) 
{
	DC1 F1 = new DC1();        //syntax of object creation
	F1.S1();
	
	
	//DC1 ----->   classname ---->datatype
	// F1 ------.objectname ------> to identify/refer object
	// new -------> keyword -> use to create an empty object
	// DC1()   ----> class name()  --> constructor call
	
	
	DC2 F2 =new DC2();
	F2.K2();                        // non static method call from diff calss using default constructor DC2
	
	// DC2     -----> classname--> datatype
	// F2 -> objectname ---->to identify /refer object
	// new ->keyword -> use to create an empty object
	// DC2    -> class name () -> constructor call
	
	
}

public void S1() 
{
	System.out.println("running method S1");
	
	
}
}
