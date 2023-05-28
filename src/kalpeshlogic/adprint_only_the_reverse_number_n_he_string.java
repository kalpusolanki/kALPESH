package kalpeshlogic;

public class adprint_only_the_reverse_number_n_he_string 
{
public static void main(String[] args) 
{
	String s1="10VALue8with20value6478";
	String count="";
//	String sum = 0;
	
	char s2[]=s1.toCharArray();
	
	for(int i=s2.length-1;i>=0;i--)
	{
		if(Character.isDigit(s2[i]))
		{
			count+=s2[i];
	
		}
//		else
//		{
//			sum=Integer.parseInt(count);
//			System.out.print(sum+"  ");
//			count="0";
//			
//		}
	}
	System.out.println(count);
}
}
