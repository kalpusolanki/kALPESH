package kalpeshlogic;

public class Reverse_sentense
{
	public static void main(String[] args)
	{
		
		String s1="My name is hero";
				
		String[] b= s1.split(" ");
//		
//		String reverse ="";
		
		for(int i=0;i<=b.length-1;i++)
		{
			String word = b[i];
			String c="";

			for(int j=word.length()-1;j>=0;j--)
			{
				c=c+word.charAt(j);
			}
			c=c+" ";
			System.out.print(c);
		}
				
	}

}
