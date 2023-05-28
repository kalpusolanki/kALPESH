package accesspecifierprotected;

public class sample2 



{
	protected int b =10 ;
	
	
	public void M3() 
	{   sample1 O1 =new sample1();
		System.out.println(O1.a);               // protected variable call through protected constructor.of diff class of same package
		O1.M1();  // protected access specifier non static method call from diff class of same package
	M4();
	}
 protected void M4()
{
	sample1 O1 =new sample1();              // same object used in proted method in diff class
	System.out.println(O1.a);               // protected variable call through protected constructor.
	O1.M1();
	 System.out.println("hi");
}
public static void main(String[] args)
{sample2 O3 =new sample2();
	O3.M3();
	O3.M4();                            // call through method of public 
//    O3.M1();         // can,t call diff clas  method with same object due to inheritance absent
	sample1 O4 =new sample1();
System.out.println(O4.a);
O4.M1();              // call diff class method with classname.method name


}
}
 