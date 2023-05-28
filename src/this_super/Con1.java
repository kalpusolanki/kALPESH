package this_super;


	public class Con1 
	{
		int num1;
		int num2;
		int num3;
		
		Con1 ()
		{
			num1=10;
			num2=15;
			
			System.out.println(num1+num2);
		}
		
		Con1 (int a, int b)
		{
			
			//this();   
			num1 = a;
			num2 = b;
			System.out.println(a+b);
		}
		
	Con1 (int a, int b, int c){
			this(10,20);
			
			num1 = a;
			num2 = b;
			num3 =c;
			
			System.out.println(a+b+c);
		}
		
		public static void main(String[] args) {
			
//			Con1 c1= new Con1(12,15,16);
			Con1 c2= new Con1(19,16);
//			c1.Con1(20,60);
//			
//			System.out.println(c1);
			
		// here we say that as we create instance through call constructor value will print
			// we call constructor into second contructor by using these keyword

		}

	
}

