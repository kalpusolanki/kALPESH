package accesspecifierdefault;

public class sample2 
{
public static void main(String[] args) 
{
	sample1 S1 =new sample1();
	S1.M2();               // we access default variable method from other class.
	//S2.M2();               // we need to create seperate object
	System.out.println(S1.a);
}
void M3()
{  sample1 S4 =new sample1();
	S4.M2();
	System.out.println(S4.a);
}

}
