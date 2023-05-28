package kalpeshlogic;

public class rewvstr_split

{
public static void main(String[] args) 
{
	String s1 = "hello everyone";
	
	String[] b=s1.split("");
	
	for(int i=b.length-1;i>=0;i--)
	{
		System.out.print(b[i]);
	}
}
}
