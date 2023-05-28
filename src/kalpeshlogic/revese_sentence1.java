package kalpeshlogic;

public class revese_sentence1
{
public static void main(String[] args) 
{
	String s="yashasvi is a batsman and hero";
	String b[]=s.split(" ");
	
	for(int i =0;i<=b.length-1;i++)
	{
		String d []=b[i].split("");

		String c = "";
		for(int j=d.length-1;j>=0;j--)
		{
			c=c+d[j];
		
		}
		System.out.print(c +" ");
	}
	
}
}
