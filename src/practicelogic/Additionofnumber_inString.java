package practicelogic;

public class Additionofnumber_inString 
{
public static void main(String[] args)
{
	
	String s1="45ha11ua75nu6";
	
	int count =0;
	int total=0;
	
	for(int i =0;i<=s1.length()-1;i++) 
	{
		char j=s1.charAt(i);
		if(j=='1'||j=='2'||j=='3'||j=='4'||j=='5'||j=='6'||j=='7'||j=='8'||j=='9'||j=='0') 
		{
			System.out.println(j);
			total=total+Character.getNumericValue(j);
			count++;
		}
	}
	
	
	System.out.println("total no of numeric presrnt in string is  "+count);
	System.out.println("total  of numeric presrnt in string is  "+total);
}
}
