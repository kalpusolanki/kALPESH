package kalpeshlogic;

public class addition_of_number_in_string_ex1
{
public static void main(String[] args)
{
	String s1 ="10value8with20value";  // it is useful to add conscutive string to integer
	//10value8with20value   
	char s2[] =s1.toCharArray();
	
	String count="0";    // string value to store numering and add into it upto numerinc then convert it into integer and "0" it again

	int sum = 0;   // add the no from converted from string when there is no numeric chharacter
	for(int i =0;i<=s2.length-1;i++)
	{
		

	
		if(Character.isDigit(s2[i]))   // if character is digit
		{
//			System.out.print(s2[i]);
			count=count+s2[i];            // add into the string (count variable)till character is not digit

		}
		else
		{
		sum+=Integer.parseInt(count);   // when character is not digit then it conver(count/string to integer) and add it hten again count declare "0"
		count="0";                   // count declare "0"
		
		}
	
	}
	System.out.println(sum);
}
}
