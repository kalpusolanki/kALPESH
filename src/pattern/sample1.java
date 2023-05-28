package pattern;

public class sample1 
{
public static void main(String[] args) 
{
//	*******
//	******
//	*****
//	****
//	***
//	**
//	*
	int row=7;
	int star =7;
	
	
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=star;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		
		star--;
	}
	
}
}
