package elseif;

public class Nested_if_example1 
{
	  public static void main(String[] args)
	  {

	    int MEM =500;
	   int inte = 250;
	   int PEM =350;

		if (inte>=100)
		{
			
				System.out.println("Exam passed");
				if(MEM>=250)
				    {
					
						System.out.println(" Elegible for interview");
						if (PEM>=300)
						{
							System.out.println("Elegible yo Mains");
						}
						else
					    	{
							System.out.println("not eligible to Mains");
						    }
						}
					
					
					else
					{
						System.out.println("not eligible to interview");
					
				}
	    }
		else
			
		{
				System.out.println("not passed");	
		}
		
	  }
}
