package array;

public class sample3 
{
public static void main(String[] args)
	{
	 int ar[] =new int[5];
	 
	 ar[0]=20;
	 ar[1]=25;
	 ar[2]=30;
	 ar[3]=35;
	 ar[4]=40;
//     ar[5]=45;	// total index 5 (0-4) but if we initializa the variable extra then its show error
     
//                 //"java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5" Shows
//     System.out.println(ar.length);
//                       // error for final printing of index
//     
 	for(int i =0;i<=5;i++)
   	{
   		System.out.println(ar[i]);  // shows error "ArrayIndexOutOfBoundsException" for next loop after 4
	}
}
}