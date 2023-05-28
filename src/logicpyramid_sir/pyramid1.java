package logicpyramid_sir;

public class pyramid1 
{
public static void main(String[] args) 
{
	int star =1;
	int space =5;
	
	
	for(int i=1;i<=6;i++)  //row
	{
		for(int k=1;k<=space;k++)
		{
			System.out.print(" ");
		}
		
		for(int j =1;j<=star;j++)  //column
		{
			System.out.print("* ");
			
		}
		
		
		System.out.println();
		
		star++;
		space--;
	}
	System.out.println("----------------------------------------");
	
	m1();	
}

public static void m1() 
{
	int star =6;
	int space =1;
	
	
	for(int i=1;i<=6;i++)
	{
		for(int k=2;k<=space;k++)
		{
			System.out.print(" ");
		}
		
		for(int j =1;j<=star;j++) 
		{
			System.out.print("* ");
			
		}
		
		
		System.out.println();
		
		star--;
		space++;
	}
}










}
