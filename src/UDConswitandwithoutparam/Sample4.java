package UDConswitandwithoutparam;

public class Sample4 
{
   int c;
   int d;
   int f;
   
   
   Sample4()
   {
	   c=295;
       d= 350;
       f=c*d;
   }
   public static void main(String[] args) {
	   
	   Sample4 O3 =new Sample4();
	   
}
  public void add() 
  {
	System.out.println(c+d);
  }
   public void sub() 
   {
	System.out.println(d-c);
   }
   
   public static void Mul()
   {
	   Sample4 O5= new Sample4();
	System.out.println(O5.f);
   }
   
   
   
}
