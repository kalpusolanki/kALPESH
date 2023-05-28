package Stringclass;

public class sample5 
{public static void main(String[] args) {
	

	String s1= "velocity";
	String s2 ="";
	String s3 = "abcd";
	String s4 ="ABCD";
	String s5 ="my name is abcd";
	String s6 ="abcabca"; // index o to 6 

	System.out.println(s3.equals(s4));
// Compares this string to the specified object. The result is true if and 
	//only if the argument is not null and is a String object that represents the same sequence of characters as thisobject.
// it cant compare case sensitive like upper case and lower case

	System.out.println(s3.equalsIgnoreCase(s4));
//considerations. Two strings are considered equal ignoring case if they are of the
//same length and corresponding Unicode code points in the two strings are equal ignoring case
	
	System.out.println(s5.contains("abc"));
	System.out.println(s5.contains("Abc"));
	System.out.println(s3.contains("abc"));
	System.out.println(s2.isEmpty());
	
	System.out.println("---------------------------------------------------");
	
	System.out.println(s1.toUpperCase());  // VELOCITY
	System.out.println(s1);
	
	System.out.println(s4.toLowerCase());
	System.out.println(s4);
	
	System.out.println("----------------------------------------------------");
	
	System.out.println(s5.contains("nam"));
	
	System.out.println("-----------------------------------------------------");
	
	System.out.println(s1.charAt(4));
	
	System.out.println("-------------------------------------------------------");
	
	System.out.println(s6.indexOf("c"));   // started search from left side no worry how many times next "c" is
	System.out.println(s6.indexOf("a"));
	System.out.println(s6.lastIndexOf("a")); // check last index of "a" from right side we cant measure how many times of "a" is.
    System.out.println(s6.lastIndexOf("b"));  // from right side
	
	System.out.println("---------------------------------------------------------");
	
	// starts with and ends with 
	
	System.out.println(s5.startsWith("my"));      //true
	System.out.println(s5.startsWith("abc"));    // false
	
	System.out.println(s5.endsWith("bcd"));   // true
	System.out.println(s5.endsWith("abcd"));  // true
	System.out.println(s5.endsWith("abc"));  // false
	System.out.println("------------------------------------------------------------");
	
	//substring method   (print till end fron starting index)
	
	System.out.println(s1.substring(4)); // city           // begin index till end.
	System.out.println(s1.substring(2));  // locity
	
	//substring to print middle character ( last u have to mention +1)
	
	System.out.println(s1.substring(4, 6)); // print only 4 and 5 chatracter 6 not print
	//System.out.println(s1.substring(2, 65));  // shows out of bond exception
	
	System.out.println("-------------------------------------------------------------");
	//concat method  ( addition to 2 string method)
	
	System.out.println(s3+s4);
	System.out.println(s3.concat(s4));
	
	System.out.println("-------------------------------------------------------------");
	// replace the string object info
	System.out.println(s5.replace("abc", "kalpesh"));
	System.out.println(s5);
	s5=s5.replace("abc", "kalpesh"); // reinitialization
	System.out.println(s5);		
	
	System.out.println("--------------------------------------------------------------");
	
	
}
}
