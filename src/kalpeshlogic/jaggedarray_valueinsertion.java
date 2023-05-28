package kalpeshlogic;

public class jaggedarray_valueinsertion 
{
public static void main(String[] args) 

{
//	  0
//	  1 2
//    3 4 5
//    6 7 8 9
//    10 11 12 13 14
	int ar[][]=new int[5][];
	
	ar[0]=new int[1];
	ar[1]=new int[2];
	ar[2]=new int[3];
	ar[3]=new int[4];
	ar[4]=new int[5];
	int count=0;
	for(int i = 0;i<=ar.length-1;i++)
	{
		for(int j =0;j<= ar[i].length-1;j++)
		{
			ar[i][j]=count++;
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
}
}
