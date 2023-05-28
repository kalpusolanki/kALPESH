package practicelogic;


public class vowelsinstring 
{
public static void main(String[] args) 
{
	String s1="alluwalla";
	int count =0;
	for(int i=0;i<=s1.length()-1;i++)
	{
		char j=s1.charAt(i);
		if(j == 'a'||j =='e'||j =='i'||j =='o'||j =='u')
		{
		System.out.println(j);
		count++;
	}
		
	}

	System.out.println("no of vowels present in string is   "+count);
	
}
}
