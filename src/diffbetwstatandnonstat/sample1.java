package diffbetwstatandnonstat;

public class sample1 
{        
//diff between static and non static variable and method also

// in these method  non static varaible for calling/static variable also calling for permanent change to all varaible.
	
	//"Aarti industries ltd "
	String empname;
	int Empcode;
	String manager;
	String orghead;
	long mobno;
	static long emermobno;
	static String Owner;
	
	
	
	public void Emdata()
	{
		System.out.println(empname+" - "+Empcode+" - "+manager+" - "+orghead+" - "+mobno+" - "+" - "+emermobno+" - "+Owner);
	}
	
}
