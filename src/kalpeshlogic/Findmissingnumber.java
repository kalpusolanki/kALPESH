package kalpeshlogic;

public class Findmissingnumber 
{
public static void main(String[] args) 
{
	int[] arr= {1,2,3,4,6,7,8,9,10};
	int n = arr.length+1;
	int actual_sum = 0;
	
	System.out.println(arr.length);
	int sum = n*(n+1)/2;
	System.out.println(sum );
	for(int i =0;i<=arr.length-1;i++)
	{
		actual_sum = actual_sum+arr[i];
	}
	System.out.println((sum-actual_sum)+"    missing no");
}
}