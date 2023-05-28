package logicpyramid_sir;

public class reverse_sentence
{
public static void main(String[] args) 
{
	String s1 = "MY name is khan";
//		String[] b=s1.split("");
////	  char f1=s1.charAt();
//		String rev = "0";	
//		
//		for (int i=b.length-1; i>=0;i--)
//		{
//		
//			System.out.print(b[i]);
//		}
//
//	StringBuffer str =new StringBuffer(s1);
//	System.out.println(str.reverse());
	
	String[] b=s1.split("");
	for(int i=0;i<=b.length-1;i++) 
	{
	System.out.println(b[i]);
	}
}
}
