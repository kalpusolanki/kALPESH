package Stringclass;

public class sample3 
{
 public static void main(String[] args) 
 	{
//	object creation of string without new keyword ==>  constant pool area
	 String s1="abc";
	 String s2="abc";
//	 String s2 = "hjg";           // we cant create a dublicate variable in const pool because info same address same
	 
	 String s3="abcde";
	 String s4="xyz";
	 s1=s1+"abcdef";
	 
	 
	 
//		object creation of string with new keyword ==> non-constant pool area 
	 String s6 = new String("abc");
	 String S7 = new String("abc");
	 String s7 = new String("fgh");
//	 String s6 = new String("abcde");
	 String s8 = new String("abcde");
//	 String s1 = new String ("abc");
//	 
	 
	 System.out.println(s1==s2);
	 System.out.println(s2==s3);
	 System.out.println(s6==s7);
	 System.out.println(s3==s8);
 	}
}
// in heap area object info are same but variable name are not same.