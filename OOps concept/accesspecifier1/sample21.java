package accesspecifier1;

import accesspecifierprotected.sample2;

public class sample21 extends sample2
{
public static void main(String[] args) 
{
	sample21 O21 = new sample21();  
	O21.M4();
	O21.M3();
	System.out.println(O21.b);  // only protected global variable executed
}
}
