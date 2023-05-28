package UDconstwithparameter;

public class sample3 
{
int  num1;
int  num2;

sample3(int a, int b)
{
	num1 = a;
	num2 = b;
}

public static void main(String[] args)
{
	sample3 O2 =new sample3(10,50);
	O2.Sub();                              // non static variable with parameter call from same class
	O2.add();
	
	System.out.println("--------------------------------------------------------------------------");
	
	
	Sample5 O3 =new Sample5 (200,100);
	O3.div();
	
	O3.mul();

	
	
	
}
public void Sub()
{
	System.out.println(num1-num2);
}
public void add() 
{
	System.out.println(num1+num2);
}
}
