package Stringclass;


public class sample6 
{
public static void main(String[] args) 
	{
	
	String s1 ="my name is khan";
	
	
	//store more information with similar type of data we use array
	
	
	s1.split(" ");  // my(0) name(1) is(2) khan(3) // space play main role its split word and without space split only character
	
	String[] s2 =s1.split(" ");
	
	System.out.println(s2[2]); // is
//	System.out.println(s2.length);
	System.out.println("------------------------------------------");
	
	for(int i =0;i<=s2.length-1;i++)
	{
		System.out.println(s2[i]);
	}
	
	
	}
}
