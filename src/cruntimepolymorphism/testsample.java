package cruntimepolymorphism;

public class testsample
{
public static void main(String[] args) 
{
	sample2 S1 = new sample2();   // son class run time binding
	S1.Camera();
	S1.Music();
	S1.XpressMusic();
	
	
	System.out.println("----------------------");
	sample1 s2=new sample1();
	s2.Camera();                    // its also run time binding of father class during object  creation
	s2.Music();
	

}
}
