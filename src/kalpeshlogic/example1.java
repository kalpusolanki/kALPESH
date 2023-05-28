package kalpeshlogic;

public class example1
{
public static void main(String[] args)
{
//	A
//	AB
//	ABC
//	ABCD
	
	String s1="ABCD";
	int k=0;
	
	for(int i=0;i<=3;i++)
	{
		for(int j=0;j<=k;j++) 
		{
			System.out.print(s1.charAt(j));
		}
		System.out.println();
		k++;
	}
}
}
