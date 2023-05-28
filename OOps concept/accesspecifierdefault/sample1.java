package accesspecifierdefault;

public class sample1
{
int a;

  sample1()
{
	  a=9;
	}
  void M2() 
 {
	System.out.println(a*a);
}
 public static void main(String[] args) 
 {
	 sample1 S2 =new sample1();
	 S2.M2();
	 System.out.println(S2.a);                   // in printing statement we use default global variable directly
}
}
