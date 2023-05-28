package casting;

public class Up_casting_testclass
{
		public static void main(String[] args) 
		{
			sample2 O1 =new sample2();
			O1.Camera();
			O1.Music();
			O1.XpressMusic();
			// method overriding_______________
			
			System.out.println("---------------------------------");
			// create object of subclass with referance/datatype of super class
			
			sample1 s =new sample2();
			
			s.Music();
			s.Camera();
//			s.XpressMusic();
			// we only sow the sample 1 method only ( which is reloaded in son class)
			
		}
}
