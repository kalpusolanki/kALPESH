package Rakhiexample;

import java.util.Scanner;

public class findlargestno_usingscanner
{
public static void main(String[] args) 
{
	int a,b,c,temp,largest;
	
	Scanner obj=new Scanner(System.in);
	System.out.println("enter first number");
	a=obj.nextInt();
	
	Scanner obj1=new Scanner(System.in);
	System.out.println("enter second number");
	b=obj1.nextInt();
	

	Scanner obj2=new Scanner(System.in);
	System.out.println("enter third number");
	c=obj2.nextInt();
	
	temp=a>b?a:b;
	largest=c>temp?c:temp;
	
	System.out.println("largest no is "+largest);
	System.out.println("second largest is "+ a);
}
}
