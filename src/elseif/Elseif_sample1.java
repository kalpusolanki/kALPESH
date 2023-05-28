package elseif;

public class Elseif_sample1 
{
	public static void main(String[] args) 
    {
	int marks = 44;
	if(marks>=95)
	{System.out.println("Distinction");
        }
	else if (marks>=85 & marks<=94)
	{System.out.println("1st class");}
	
	else if (marks>=60 & marks<=84)
	{System.out.println( "2nd class");}
	
	else if (marks>=45 & marks<= 59)
	{System.out.println( "pass");}
	
	else 
	{System.out.println("fail");}
    
        
    }
}
