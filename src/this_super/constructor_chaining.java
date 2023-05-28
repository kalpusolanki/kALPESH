package this_super;

public class constructor_chaining 
	{
		int num1;
		int num2;
		int num3;
		
		constructor_chaining ()
		{
			num1=32;
			num2=54;
			
			System.out.println(num1);
		}
		
		constructor_chaining (int a, int b)
		{
			
			this();   
			num1 = a;
			num2 = b;
			System.out.println(a+b);
		}
		
		constructor_chaining (int a, int b, int c){
			this(34,56);
			
			num1 = a;
			num2 = b;
			num3 =c;
			
			System.out.println(a+b+c);
		}
		
		public static void main(String[] args) {
			
			constructor_chaining c1= new constructor_chaining(12,15,16);
//			Con1 c2= new Con1(19,16);
//			c1.Con1(20,60);
}
}
