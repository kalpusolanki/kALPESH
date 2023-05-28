package Methods;

public class StaticMetcallDiffclasswithoutpara
{
	//static regular method from diff class              //  different class name method name
		//main method
		
		
		public static void main(String[] args) //main method declaration
	{//main method body
			System.out.println("hiii");
		class2K1method.K1();
		class2K1method.K2();
		Class3K3method.K3();
		Class3K3method.K4();
		class4K5method.K5();
		K10();
	}
	public static void K10()
	{
		Class3K3method.K3();
		class4K5method.K5();
		class2K1method.K1();
	}
}
