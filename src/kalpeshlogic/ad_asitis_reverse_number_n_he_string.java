package kalpeshlogic;

public class ad_asitis_reverse_number_n_he_string 
{
public static void main(String[] args) 
{
	String s1="10VALue8with20value6478b";
	String s2="";
	String s4;
	char[] s3=s1.toCharArray();
	
	
	for(int i=0;i<=s3.length-1;i++)
	{
		if(Character.isDigit(s3[i]))
		{
			s2+=s3[i];
			
		}
		
		else {
		char s5[]=s2.toCharArray();
			for(int j=s5.length-1;j>=0;j--)
			{
				System.out.print(s5[j]);
			}
		System.out.print(" ");
			s2="";
		
		}
		
	}
	
	
	
}
}
