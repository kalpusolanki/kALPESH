package kalpeshlogic;

public class Findvowelsandcount
{
public static void main(String[] args) 
{
String s1="umeshkothari";
int count =0;
for(int i=0;i<=s1.length()-1;i++)

{
	char b=s1.charAt(i);
	if(b=='a'||b=='e'||b=='i'||b=='o'||	b=='u')		
	{
		System.out.println(b);
		count++;
	}
	
}
 System.out.println(count);
// System.out.println(s1.length());
}
}