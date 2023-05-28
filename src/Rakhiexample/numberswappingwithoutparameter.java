package Rakhiexample;

public class numberswappingwithoutparameter
{

	public static void main(String[] args) 
	{
		int num1=20;
		int num2=10;
		
		
		System.out.println("before swapping:" + num1+"and" +num2);
		
		num1 =num1+num2; //30
		num2 =num1-num2; // 30-10 =20
		num1= num1-num2; // 30-20=10
		
		
		System.out.println("After swapping:" + num1+"and" +num2);
		
	}
}
