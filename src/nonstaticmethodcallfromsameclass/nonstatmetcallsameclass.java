package nonstaticmethodcallfromsameclass;

public class nonstatmetcallsameclass
{
    public static void main(String[] args) 
   {
    	nonstatmetcallsameclass O1 =new nonstatmetcallsameclass();
    	O1.M1();
    	O1.M2();
   }
    public void M1() 
    {
	System.out.println(48);
    }
    public void M2() 
    {
		System.out.println("67");
	}
}
