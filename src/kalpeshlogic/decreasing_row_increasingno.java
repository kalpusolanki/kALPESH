package kalpeshlogic;

public class decreasing_row_increasingno 
{
	public static void main(String[] args)
	{
//		111111
//		22222
//		3333
//		444
//		55
//		6
		String s1="123456";
		
		int star =6;
		
		for(int i=0;i<=5;i++) 
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print(s1.charAt(i));
			}
			System.out.println();
			star--;
		}
		
		
		
		
	}

}
