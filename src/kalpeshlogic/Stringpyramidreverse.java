package kalpeshlogic;

public class Stringpyramidreverse 
{
public static void main(String[] args) 
{
//	AAAA
//	BBB
//	CC
//	D
	
	String s1="ABCD";
	int k=4;
	
	for(int i=0;i<=3;i++)
	{
		for(int j=1;j<=k;j++) 
		{
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		k--;
	}
	
}
}
