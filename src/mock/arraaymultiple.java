package mock;



public class arraaymultiple 
{
public static void main(String[] args) 
{
	int ar[][]=new int [3][];
	ar[0]=new int [2];
	ar[1]=new int [3];
	ar[2]=new int [1];
	
int count=0;
	
	for(int i=0;i<=ar.length-1;i++)
	{
	
		
		for(int j=0;j<=ar[i].length-1;j++)	
			{
			ar[i][j]=count++;
			
			System.out.print(ar[i][j]+" " );
			}
		System.out.println();
	
	}

}
}
