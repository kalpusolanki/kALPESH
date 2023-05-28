package kalpeshlogic;

public class find_min_array
{
public static void main(String[] args) 
{
	int[] s1 = {12,51,42,6,8,953,124,111,57};
	int a= s1[0]; // 12  6
	
	for(int i=0;i<=s1.length-1;i++)
	{
		if(s1[i]<a) //6<12   
		{
		a=s1[i];   // a=6
		
		}
		
	
	}
	System.out.println(a);


}
}
