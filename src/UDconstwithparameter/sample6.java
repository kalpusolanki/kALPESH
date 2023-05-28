package UDconstwithparameter;


public class sample6 
{  //declaration
	int num1;
	int num2;
	
	
	//declaration
	sample6(int a,int b)  //user defined constructor with 2 (int,int) parameter
	{
		num1=a;           //Use1  to initialize the global variable
		num2=b;           // assign local variable information to global variable
	}
		
public static void main(String[] args) 
{
	sample6 O1=new sample6(29,25);
	O1.add();                                 //initialization of local variable
	
	sample6 O2 = new sample6 (89,25);
	O2.Mul();
	
	System.out.println("----------------------------------");
	
	Sample7 O3 =new Sample7(25,50);           //initialize of local variable of diff class
	O3.M1();
	
	Sample7 O4 =new Sample7(250,500);
    O4.M2();
	
}
//Usage
public void add() 
{
	System.out.println(num1+num2);
}
public void Mul() 
{
	System.out.println(num1*num2);
}
}
