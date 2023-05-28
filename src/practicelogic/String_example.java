package practicelogic;

public class String_example 
{
public static void main(String[] args) 
{
	String s1="kalpesh";

	//for forward
	for(int i =0;i<=s1.length()-1;i++) 
	{
		System.out.print(s1.charAt(i));
	}
	System.out.println();
	System.out.println("-----------------------------");
	//for rev
		for(int i =s1.length()-1;i>=0;i--) 
		{
			System.out.print(s1.charAt(i));
		}
}
}
