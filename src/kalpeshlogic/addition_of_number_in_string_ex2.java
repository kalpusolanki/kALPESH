package kalpeshlogic;

public class addition_of_number_in_string_ex2 
{
public static void main(String[] args)
{
	String s1 ="10value8with20value6478";//
	String count="";
	int sum=0;
	
	char s2[]=s1.toCharArray();

	for(int i=0;i<=s2.length-1;i++)
	{
	
		if(Character.isDigit(s2[i]))   // if character is digit check
		{
//			System.out.println(s2[i]);
			count+=s2[i];              //stored in string inthe form of character
			sum+=Integer.parseInt(count);// convert into integer and add to sum variable
			count="0";                 // count string again "0"  main step
		}
	}
System.out.println(sum);               // print
}
}
