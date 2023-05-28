package extends1;

public class demo2 extends demo1               // using extends keyword access data from parent class.

{
int b = 30;   // global variable same class
static int c = 50;
public void M() 
{
	int b = 25;                // local variable same class / son class
	System.out.println(b);
	System.out.println(this.b);     // global variable same class / son class
	System.out.println(super.b);     // global variable of super class
	System.out.println(c);
	
}

public static void main(String[] args) 
{
	demo2 O1 = new demo2();
	O1.M();
}
}
