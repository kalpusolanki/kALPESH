package accessspecifierprivate;

public class sample2 
{
public static void main(String[] args) 
{
	sample1 S2 =new sample1();          //public method containing private gobal variable calling
	
	S2.M1();                             // if constructor is private it cant access from other class
//	S1.M1();                            // required seperate object to execute.
}
}
