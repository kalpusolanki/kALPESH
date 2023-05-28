package kalpeshlogic;

public class pyramid 
{
public static void main(String[] args) 
{
//	     *
//      * *
//     * * * 
//    * * * *
//   * * * * *
	
	int star =1;
	int space =5;
	for (int i =1;i<=6;i++)
	{
		for(int k=1;k<=space;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++)
		
		{
			System.out.print("* ");
		}
		System.out.println();
		star++;
		space--;
	}
//	  * * * *
//     * * *
//      * *
//       *
	int space1=1;
	int star1 =5;
	for(int i=1;i<=5;i++)
	{
		for(int k=1;k<=space1;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star1;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		star1--;
		space1++;
	}
			
	
	
	
	
	

}
}
