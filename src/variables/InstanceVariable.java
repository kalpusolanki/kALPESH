package variables;

public class InstanceVariable
{
	int a;
	InstanceVariable (int n)
	{
	 a=n;
	}
	public void show()
	{
	System.out.println ("The Number is :- "+a);
	}
	public static void main(String[] args)
	{
	InstanceVariable Insta1=new InstanceVariable(100);
	Insta1.show();
	}
	}
//}
//}//Features
//To use an instance variable an object of the class must be created.
//An instance variable is destroyed when the object created it is associated with is destroyed.
//An instance variable does not compulsory need to be initialized.
//Instance variables are accessible inside the same class that declares them.
//Limitations of Instance Variable
//It cannot be declared static, abstract, striftp, synchronized, and native.
//It can be declared final and transient.
//It can be of any of the four access modifiers available in Java (private, public, protected, and default).