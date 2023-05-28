package kalpeshlogic;

public class adonly_print_character_in_string 

{
public static void main(String[] args) 
{
	String s1="10VALue8with20value6478";
	s1=s1.replaceAll("[0-9]", "");
	System.out.println(s1);
	
	char s2[]= s1.toCharArray();
	for(int i =0;i<=s1.length()-1;i++)
	{
		System.out.print(s2[i]+"  ");
	}
}
}
