package array;

public class multidimentionalarray
{public static void main(String[] args) {
	

	int a[][]={{1,1,1},{2,2,2},{3,3,3}};  // 3rows and 3 column
	int b[][]={{1,1,1},{2,2,2},{3,3,3}};
	
	
	for(int i =0;i< a.length;i++)
	{
		for (int j=0;j< a[i].length;j++)
		{
			
//		
//			 c[i][j]=int [i][j];
			System.out.print(a[i][j]+"  " );
		}
		System.out.println();
	}
	
	System.out.println("---------------------------------------");
	
	for(int i =0;i< b.length;i++)
	{
		for (int j=0;j< b[i].length;j++)
		{
			
//		
//			 c[i][j]=int [i][j];
			System.out.print(b[i][j]+"  " );
		}
		System.out.println();
	}
}
}