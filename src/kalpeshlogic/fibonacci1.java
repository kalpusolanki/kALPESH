package kalpeshlogic;

public class fibonacci1 
{
public static void main(String[] args) 
{
//	1
//	2
//	3
//	5
//	8
//	13
//	21
//	34
//	55
	
	int a=0,b=0,c=1;

//	int a,b,c=1;
	
	for(int i=1;i<=13;i++)
	{
		a=b;
		b=c;
		c=a+b;
		System.out.println(c);
	}
}
}
