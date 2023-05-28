package kalpeshlogic;

import java.util.Arrays;

public class find_secondlargest_largest_and_smallestno 
{
public static void main(String[] args) 
{
	int ar[]= {25,41,89,654,17,1,5,17,6,56,94,101,0};


	int largest=ar[0];
	int smallest=ar[0];
	int sclarg=ar[0];
	for(int i=0;i<=ar.length-1;i++)
	{
	if(smallest>ar[i]) //
	{
		smallest =ar[i];
	}
	 if(ar[i]>largest)
	{
		sclarg=largest;
		largest=ar[i];
		
	}
	else if(ar[i]>sclarg)
	{
		sclarg=ar[i];
	}

	}
	System.out.println(smallest);
	System.out.println(largest);
	System.out.println(sclarg);
}
}
