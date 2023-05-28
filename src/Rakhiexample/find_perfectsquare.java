package Rakhiexample;

public class find_perfectsquare 
{
public static void main(String[] args) 
{
	int a=425;
	
	double root =  Math.sqrt(a);
	System.out.println(root);
	System.out.println(Math.floor(root));
	
	
	if(root-Math.floor(root)==0)
	{
		System.out.println("PS");
	}
	else 
	{
		System.out.println("NPS");
	}
		
}
}
