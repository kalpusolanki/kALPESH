package accessspecifierprivate;

public class sample1 
{
 private int a;

sample1()
{
	a=10;
	}
public void M1() 
{
	System.out.println(a*a);
}

public static void main(String[] args) 
{
	sample1 S1 = new sample1();
	    S1.M1();
	    System.out.println(S1.a);         // in printing statement we execute private globle variable
}
}
