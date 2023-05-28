package kalpeshlogic;

public class String123 
{
public static void main(String[] args)
{
	String s1 ="kalpesh123";
	
	
	System.out.println(s1.substring(7));
	String b[]=s1.split("kalpesh");
	for(int i=0;i<=b.length-1;i++)
	{
		System.out.println(b[i]);
	}
}
}
