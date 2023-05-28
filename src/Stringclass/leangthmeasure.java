package Stringclass;

public class leangthmeasure 
{
public static void main(String[] args)
{
	String s1="my name is khan";
	int count =0;
	
	System.out.println(s1.length());
	
	for(int i =0;i<=s1.length()-1;i++) //
	{
		if (s1.charAt(i)!=' ')        //
		{
			count++;
		}
		
	}
	System.out.println(count);
}
}
