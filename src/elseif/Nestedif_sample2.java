package elseif;

public class Nestedif_sample2
{
	public static void main(String[] args)
	{
		int Pollvotes =750;
		
			
			if (Pollvotes>=700)
		
			{
				System.out.println("PM");
				{
					if( Pollvotes>=600)
					
						{
							System.out.println("CM");
						}
						else 
						{
							System.out.println("Chaprasi");
						}
					}
				
				
				}
		else
		    {
			
			System.out.println("Tahsildar");
			}

	  }

}
