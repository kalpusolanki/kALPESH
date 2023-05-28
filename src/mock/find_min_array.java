package mock;

public class find_min_array

{
	public static void main(String args[])
	{  
		int arr[]={33,3,4,5};//declaring and initializing an array  
		int small =arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
		if	(arr[i]<small)
		{small =arr[i];}
		}
		System.out.println(small);	
}

}
