package kalpeshlogic;

import java.util.Scanner;

public class Monthday_usingscannerofYear 
{
public static void main(String[] args)
{	int month;
	Scanner obj =new Scanner(System.in);
	System.out.print("Enter month ;");
	month=obj.nextInt();

	if(month>12)
	{
		System.out.println("not valid month");
	}
	else
	{
	
		System.out.print("year");
	}
	
	int year;

	year =obj.nextInt();
	switch(month)
	{
	case 1:System.out.println("januwary 31 "+year);break;
	case 2:System.out.println("feb 31 "+year); break;
	case 3:System.out.println("may 62 "+year);break;
	case 4:System.out.println("jun 29 "+year);break;
	case 5:System.out.println("july 31 "+year);break;
	case 6:System.out.println("aug 31 "+year);break;
	
	case 7:System.out.println("sep 1 "+year);break;
	case 8:System.out.println("oct 3 "+year);break;
	case 9:System.out.println("nov 31 "+year);break;
	case 10:System.out.println("march 31 "+year);break;
	case 11:System.out.println("april 30 "+year);break;
	case 12:System.out.println("dec 31 "+year);break;
	}
}
}
