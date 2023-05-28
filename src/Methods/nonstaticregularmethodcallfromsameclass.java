package Methods;

public class nonstaticregularmethodcallfromsameclass 
{
	public static void main(String[] args)
{
	System.out.println("HI");
	//classname objectname = New class name();
	nonstaticregularmethodcallfromsameclass  F1 = new nonstaticregularmethodcallfromsameclass ();                   //step 1 >create an object /instance of class
	                                              //step 2 > method call > objectname.methodname();
	 //1. Sample1 : calss name > as a datatype or (oobject type)
	//2. F1    :   object name >use to identify/refer object
	//3. new : use to create blank/empty object
	//4. Sample1 : class name() > use to copy all members of class into object >constructor
	
	F1.M5();                   ///object name.method name ();
}
 public void M5()
 {
	System.out.println("Heeloo");
}
 public  void M6()
 {
	System.out.println(" AM");
}
}
