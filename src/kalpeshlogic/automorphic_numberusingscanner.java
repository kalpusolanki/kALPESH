package kalpeshlogic;

import java.util.Scanner;

public class automorphic_numberusingscanner

{
public static void main(String[] args) 
{
	int num;
	Scanner obj =new Scanner(System.in);
	System.out.println("Enter number to check automorphic");
	num=obj.nextInt();
	
	int square =num*num;
	
	if(num%10!=square%10)
	{
		System.out.println("not correct");
	}
	else
	{
		if(num%10==square%10)
			
		{
			int a;
			a=square%10;
			square	=square/10;
			int d= square%10;
			a=d*10+a;
			
			
			
			if(num==a)
			{
				System.out.println("T");
			}
			else
			{
				System.out.println("NT");
			}
		}
		
	}
}
}
