package kalpeshlogic;

public class total_capital_smallletrin_Str 
{
public static void main(String[] args)
{
	String s1= "HanumANjI";
	int upper=0;
	int lower =0;
 String d="";
	for(int i=0;i<=s1.length()-1;i++)
	
	{
		char a=s1.charAt(i);
		if(a>='A'&& a<='Z')
		
			{System.out.println(a);
			upper++;}
	
		if(a>='a'&& a<='z')
		{
			lower++;

		d=d+a;
		}
		
	}
	System.out.println("upper"+upper);
	System.out.println("lower"+lower);
	System.out.println("===================");
	System.out.print(d);
}
}
