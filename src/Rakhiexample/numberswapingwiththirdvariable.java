package Rakhiexample;

public class numberswapingwiththirdvariable 
{
	public static void main(String[] args) {
		

	int num1=20;
	int num2=10;
	int num3=0;
	
	System.out.println("before swapping:" + num1+"and" +num2);
	
	num3= num1;    //20
	num1 = num2;  // 10
	num2 = num3 ;   //20
	
	
	System.out.println("after swapping:" + num1+"and" +num2);
	
}
}