package interfaceinheritance;

public class sample4 implements sample3
{
public static void main(String[] args) 
{
	sample4 s1 = new sample4();
	s1.M1();
	s1.M2();
}

	public void M1() 
	{
	System.out.println("hiii");
		
	}

	public void M2() 
	{
		
		System.out.println("Hello");
	}


}

// we acn inherited multiple interface and implement  class to complete all methods into that class
