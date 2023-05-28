package overloadconstructor;

public class Demo1
{ //declaration
	int num1;
	int num2;
	String s1;
	float f1;
	double d1;
	
	//for constructor
	
	Demo1()                                  //user defined  constructor with zero parameter
	{
		num1 = 25;
		num2 = 50;
		f1 = 5.6f;
		d1 = 5.6639d;
	}
	
	Demo1(String s2,int a,int b)            //user defined constructor with 3 parameter
	{
		s1=s2;
		num2 =a;
		num1=b;
	}
	
	Demo1(double a,float b)                //user defined constructor with 2 parameter
	{
		d1=a;
		f1 =b;
	}
	
	Demo1(String a,float b)             //pls check float and double
	{
		s1=a;
		f1=b;
	}
	
	
	public void add() 
	{
		System.out.println(num1+num2);
	}
	
	public void decadd() 
	{
		System.out.println(f1+d1);
	}
	public void decsub()
	{
		System.out.println(d1-f1);
	}
	
	public void stnamemarks()
	{
	
		System.out.println(s1+"--"+f1);
	}
	
	
	//main method
public static void main(String[] args)
{
	Demo1 O1 =new Demo1(29.666d,3.66f);               // double,float
	O1.decadd();
	System.out.println("-------------------------------------------");
	Demo1 O2 =new Demo1 ("kalpesh",2.66f);         // string,float
	O2.stnamemarks();
	System.out.println("-------------------------------------------");
	Demo1 O3 =new Demo1();                        // user defined constructor with  zero parameter.
	O3.decadd(); 
	System.out.println("-------------------------------------------");
	Demo1 O4 =new Demo1("",25,19);                  // using string,int ,int   
	O4.add();
}
}
