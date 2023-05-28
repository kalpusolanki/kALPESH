package kalpeshlogic;

public class Strpyramidcharacter
{
public static void main(String[] args)
{
//	A
//	BB
//	CCC
//	DDDD
	
	String s1="ABCD";
   int k=1;
	for(int i=0;i<=3;i++)
	{
		for(int j=1;j<=k;j++)
		
		{
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		k++;
	}
	
}
}
