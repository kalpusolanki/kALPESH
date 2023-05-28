package array;

public class values_prst_nt 
{
public static void main(String[] args) 
    {
	float ar []= {45.5f,58.6f,59.7f,105.56f};
	
	float a=46.5f;
	boolean c=false;
	for (float d:ar)
	{
		if (a==d) 
		{
			c=true;
			break;
		}
		
	}
	
	if(c==true) 
	{
		System.out.println("present");
	}
	else 
	{
		System.out.println("not present");
	}
	
	
	
	
	
	}
}

