package UDconstwithparameter;

public class Sample7 
{//declaration of global variable in diff class
int num3;     
int num4;

Sample7(int c,int d)              //User defined constructor with 2  (int,int) parameter at diff class
    {
	  num3 = c;               //intialize the global variable
	  num4 = d;               //assign local variable information to global variable
	
	}                            // dont use integer here

public void M1() 
{
	System.out.println(num4*num3);
}

public void M2() 
{
	System.out.println(num4/num3);
}
}
