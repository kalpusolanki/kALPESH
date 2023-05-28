package controlstatement;

import java.util.Scanner;

public class Switch 
{
	public static void main(String[] args)
	{    int a=4;
	    int b =0;
	     
	 
	    
		switch(a)
		
		{
			case 1: System.out.println("For ENglish");
		break;
		
		    case 2: System.out.println("for marathi");
		break;
		
		case  3: System.out.println("for Gujrathii");
		break;
		
		case 4: System.out.println("for Hindi");
		{
			 
		
			switch(b)
			
			{
				case 1: System.out.println("For ENglish 2");
			break;
			
			    case 2: System.out.println("for marathi 3");
			break;
			
			case  3: System.out.println("for Gujrathii 6");
			break;
			
			default: System.out.println("no one input");
		      }
		break;
		
		}
		default:System.out.println("No input");
	}
	
}
}