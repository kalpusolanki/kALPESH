package kalpeshlogic;

import java.util.Scanner;

public class leapyear 
{
public static void main(String[] args)


{	
	int a=2000;

	Scanner obj = new Scanner(System.in);
	System.out.print("enter any calender year"  );
		 a=obj.nextInt();
	if(a%400==0||(a%4==0&&a%100!=0))
	{
		System.out.println(a+" is leap year");
	}
	else
	{
		System.out.println(a+ " is not leap year");
	}
obj.close();
}
}
