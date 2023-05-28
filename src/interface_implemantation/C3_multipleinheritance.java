package interface_implemantation;

public class C3_multipleinheritance implements I1_multipleinheritance,I2_multipleinheritanc
{
              public void M1() 
              {
            	  System.out.println("method 1 class completed");
              }
              public void M3()
            {
				System.out.println(" method 3 class completed ");
			}
			@Override
			public void M4() 
			{
				// TODO Auto-generated method stub
				
			}
			@Override
			public void M2() 
			{
				// TODO Auto-generated method stub
				
			}
}
// automatic auto generate method/ override but not print/ if u do some method then its a
 // abstract class again
// not diamond ambiguity is here due to absense of super object of super interface.