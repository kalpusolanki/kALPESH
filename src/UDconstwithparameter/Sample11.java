package UDconstwithparameter;

public class Sample11 
{
	// step 1 -declaration
       int num1;
       int num2;

 

      Sample11 (int a,int b)
      
     { 
	num1 = a;               
	num2 = b;
	
        }
	                                                // problem of import
	
	// step 3 - usage

        public void M1() 

    {
	System.out.println(num1+num2);
    }

	public void M3()
	{
		System.out.println(num1-num2);
	}
	
	
	public static void main(String[] args) 
	{
		Sample11 O2= new Sample11 (6,2);
		
		O2.M1();		
	}

	}
	