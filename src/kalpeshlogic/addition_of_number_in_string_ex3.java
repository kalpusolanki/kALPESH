package kalpeshlogic;

public class addition_of_number_in_string_ex3
{
public static void main(String[] args) 
{
	String s1 ="10VALue8with20value6478";
	
	 s1=s1.replaceAll("[a-z,A-Z]", "");
	System.out.println(s1);
	
int temp=0;

char s2[]=s1.toCharArray();

	for(int i=0;i<=s2.length-1;i++)
	{
	temp+=Character.getNumericValue(s2[i]); // convert char value to numeric
	}
	System.out.println(temp);
}
}
// in these method Character.getNumericValue(s2[i]) if numeric is present then no worry if character is present it add ascii value