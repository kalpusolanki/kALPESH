package defaultconstructor;

public class Dcwithparameter 
{
 
 public static void main(String[] args) 
  {
	 Dcwithparameter O2 =new Dcwithparameter();
	 O2.add(9,6);
	 
	 O2.Sub(29,26);                     // with same class
	 
	 System.out.println("------------------------------------------------------------------");
	 
	 Dcwithparameterdiffclass.sub(29 ,26);         //static method call from diff class
	 
	 Dcwithparameterdiffclass O3 =new Dcwithparameterdiffclass();
	 O3.add(29,19);                                 // non static method call from diff class 
	 
  }
	
	
	public void Sub(int num1,int num2) 
	{
		System.out.println(num1-num2);
		
	}
	
	public void add(int num1,int num2) 
	{
		System.out.println(num1+num2);
	}
	
	
}
