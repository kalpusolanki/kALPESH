package Stringclass;

public class sample4 
{
public static void main(String[] args) 
{
	String s1 = "velo city";
	String s2 = "    ";
	
	System.out.println(s1.length());
	System.out.println(s1.isEmpty());
	System.out.println(s2.isBlank());
	System.out.println(s2.isEmpty());
	
	//Returns true if the string is empty or contains only white space codepoints,otherwise false.
}
}
