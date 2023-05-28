package abstract_class;


//incomplete class or abstract class

 abstract public class demo1  // we need to add abstract keyword before class.
{  // complete method
	int a;
	int b;
	 demo1()
	 {
		 a=20;
		 b=25;
		 }
	 
public  void M1() // method  declaration
{
	System.out.println(a+b); // method defination
}
public void M2()        // method declaration
{
	System.out.println("running method M2");  // method defination
}
      // incomplete method
  abstract public void M3();     // method declaration 


// here we need to add abstract keyword before method and semicolan in last and remove the corly braces.
}
