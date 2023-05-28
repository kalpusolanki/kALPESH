package Methods;

public class SaticmethodCall_SameClass
{
	//class body
		//main method
		//1.static regular method call from same class   ==method nameK2()
	public static void main(String[] args) 
	{
		String studname;
		int rollno;
		double mobno;
		float perc;
		char grade;
		
		
		studname="Kalpesh@123";
		rollno=55006809;
		mobno= 8888854.593345896d;
		perc=99.99589f;
		grade = 'A';
		
		System.out.println("Employee = " +studname + " Solanki");
		System.out.println(" id no = "+ rollno + " Aarti indu");
		System.out.println( "home = "+mobno );
		System.out.println("percentage = "+perc + "%");
		System.out.println( "Grade =  "+ grade);
		
		
		K2();
	}
	public static void K2()
	{
		String studname;
		int rollno;
		long mobno;
		float perc;
		char grade;
		
		
		studname="Harsh@123";
		rollno=55006810;
		mobno= 9421545933l;
		perc=11.12f;
		grade = 'Z';
		
		System.out.println("Employee = " +studname + " Solanki");
		System.out.println(" id no  =  "+ rollno + "  Aarti indu");
		System.out.println( "home  =  "+mobno );
		System.out.println("percentage =  "+perc + "%");
		System.out.println( "Grade  = "+ grade);
	}
}	
	



