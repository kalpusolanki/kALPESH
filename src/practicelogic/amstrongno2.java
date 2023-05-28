package practicelogic;

public class amstrongno2 
{
public static void main(String[] args)
       {
	// armstrong no 153,371,1634
	     int n= 1634;
	     int a=0;
	     int rem= 0;
	     int b=0;
	    while (n!=0)                    // it contains no cube it raise to the power 4.
	    {
	    	rem=n%10;
	    	n=n/10;
	    	a=rem*rem*rem*rem;
	        b=b+a; 	
	        
	    	
	    }
	    System.out.println(b);
	
       }
}
