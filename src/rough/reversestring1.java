package rough;

public class reversestring1 
{
public static void main(String[] args) 
{
	String b ="Rakhi";
			
			String f1[]= b.split("");
			for (int i=b.length()-1;i>=0;i--)
			{
				System.out.println(f1[i]);
			}
}
}
