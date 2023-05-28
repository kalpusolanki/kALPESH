package accesspecifierprotected;


public class sample1
{
 protected int a;
 
 protected sample1()
 {
	 a=10;
 }
 protected void M1() 
 {
	System.out.println(a*a*a);
}
 public static void main(String[] args) 
 { 
	sample1 S1 = new sample1();
	System.out.println(S1.a);        
	S1.M1();
}
}