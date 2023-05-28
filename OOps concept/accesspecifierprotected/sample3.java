package accesspecifierprotected;

public class sample3 extends sample1
{
	public static void main(String[] args) {
		
	
	sample3 O11 = new sample3();
	
		System.out.println(O11.a);       // protected variable call through one object using inheritance having same package
		
		O11.M1();                        // protected method of sample 1  call through one object because of inheritance
		O11.M5();
	}
	
	public void M5() 
	{ 
		sample3 O12 = new sample3(); // we create another object after inheritance because of its another non static method and other is its not a standard practice we have to call directly in main method.
		O12.M1();
	}
}
