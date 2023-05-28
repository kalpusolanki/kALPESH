package statregmet_witparametersamclass;

public class sample3
{
	public void m1()
	   {
		   System.out.println( "hii");
		   
	   }
	   public static void m2()
	   
	   {
		   System.out.println("hello");
		     sample3 F22=new sample3();
		     F22.m1();                     //static method me non static method call nahi hotta  hai its not standard practice
		 
		  
	   }
		public static void main(String[] args) 
		{
			sample3 F1=new sample3();
			m2();                             //imp programme
	         F1.m1();
		
	}
}
