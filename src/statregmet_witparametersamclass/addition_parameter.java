package statregmet_witparametersamclass;

public class addition_parameter 
{
	public static void main(String[] args)
	{
		addition(2,9);
		addition(1.2f,3);
	}


	public static void addition(int num1,int num2)
	{
		System.out.println(num1 + num2);
	}

	public static void addition(float num1,int num2)
	{
		System.out.println( num1-num2);
	}


}
