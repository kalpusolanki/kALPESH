package UDConswitandwithoutparam;

public class Sample3 
{     // user defined constructor call from diff class
	// data declaration 
	
	int num1;
	int num2;                 // non static global variable
	int num3;
	
	//data initialization
	Sample3()                //user defined constructor
	{
		num1 = 32;            // initialize globally
		num2 = 25;            // load all member of class into object
		num3 = num1*num2;
	}

	public static void main(String[] args)
	{
		Sample3 O2 =new Sample3();                   // O2 object is for all class
		O2.add();                                     // sample 3-> class name ----datatype
	                                                // O2 -object name------identify  object
	                                                 // new ------- keyword------blank object
	                                                 // sample3() --------user defined constructor call
		O2.sub();
// call u directlu		Mul();                
		System.out.println("--------------------------------------------------------------------------");
		Sample4 O4 =new Sample4();
		O4.add();                                // non static method call from diff class
		O4.sub();                                // non static method call fromd diff class
		
		Sample4.Mul();
		
		
		// sample4 ------ class name ----- datatype of diff class
		// O4 ----------object name ---          to identify or refer object
		// new --------- keyword ---------use to create an empty object
		// Sample4()     --------user defined construcor call at diff class  
	}
	public void add() 
	{
		System.out.println(num1+num2);
	}
	public void sub() 
	{
		System.out.println(num1-num2);
	}
	public static void Mul() 
	{
		Sample3 O1 = new Sample3();
		
		System.out.println(O1.num3);
	}
}