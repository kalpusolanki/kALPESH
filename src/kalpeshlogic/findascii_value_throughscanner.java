package kalpeshlogic;

import java.util.Scanner;

public class findascii_value_throughscanner 
{
public static void main(String[] args) 
{

	
	Scanner obj=new Scanner(System.in);
			System.out.println("enter alphabet for ASCII");
	char ch	 = obj.next().charAt(0);
	int value =ch;
	  
System.out.println(value);
}
}
