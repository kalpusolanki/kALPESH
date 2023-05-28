package array;

public class max_numner_using_for_eachloop
{
public static void main(String[] args) 
{
	int ar[]= {21,151,146,1236,5,9};
	int max =0;
	for(int e:ar)
	{
		if(e>max) 
		{
			max=e;
		}
	}
	System.out.println(max);
}
}
