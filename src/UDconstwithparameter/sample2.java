package UDconstwithparameter;

public class sample2 
{
	int  num1;
	int  num2;
	
	sample2(int a,int b)
	{
		num1 = a;
		num2 = b;
	}

	public static void main(String[] args)
	{
		sample2 O2 = new sample2(263,26);
		O2.add();
	}
	
	
	public void add() 
	{
		System.out.println(num1+num2);
	}
	
	
	
}
