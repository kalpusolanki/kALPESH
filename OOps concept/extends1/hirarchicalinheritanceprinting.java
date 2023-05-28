package extends1;

public class hirarchicalinheritanceprinting
{
public static void main(String[] args) 
{
	hirarchicalinheritance1 O1 = new hirarchicalinheritance1 ();
			O1.Car();
			O1.Bike();
			O1.Home();
			
			
			System.out.println("-----------------");
			
			
			
	hirarchicalinheritance2 O2 = new hirarchicalinheritance2 ()	;	
			O2.Laptop();
			O2.Bike();
			O2.Home();
			
			
			System.out.println("----------------------------");
			
	hirarchicalinheritance3 O3 = new hirarchicalinheritance3 ()	;
	 O3.Helicopter();
	 O3.Bike();
     O3.Home();
	
}
}
