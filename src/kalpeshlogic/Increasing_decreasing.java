package kalpeshlogic;

public class Increasing_decreasing 
{
public static void main(String[] args)
{
//	*
//	**
//	***
//	****
//	*****
//	****
//	***
//	**
//	*

	int star =1;
	int tare =4;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=star;j++) 
		{
			System.out.print("*");
		}
		System.out.println();
		star++;
	}
	for(int k=1;k<=4;k++)
	{
		for(int n=1;n<=tare;n++) 
		{
			System.out.print("*");
		}
		System.out.println();
		tare--;
	}
	
	
	
}
}
