package Methods;

public class NonSaticCall_sameclass 
{
  public void m1()
  {
	  System.out.println("Rakhi");
  }
  public static void main(String[] args)
  {
	  NonSaticCall_sameclass m= new NonSaticCall_sameclass();
	  m.m1();
 }
  
}
