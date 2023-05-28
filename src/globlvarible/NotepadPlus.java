package globlvarible;

public class NotepadPlus {
	int a = 10;
	static int b = 20;
	public static void m1()
	{
	int a = 30;
	System.out.println(a);
	}
	public void m2()
	{
	int a = 40;
	System.out.println(a);
	}
	public static void main(String[] args)
	{
	int a = 50;
	NotepadPlus n1 = new NotepadPlus();
	System.out.println(n1.a); //10  // instance variable global for objectname.variablename
	System.out.println(b); //20
//	NotepadPlus.
	m1(); //30
	n1.m2(); //40
	System.out.println(a); //50     // local variable call directly
	
	System.out.println("----------------------------");
	NotepadAnother n2 = new NotepadAnother(); 
	System.out.println(n2.a); //60
	System.out.println(NotepadAnother.b);//70
	NotepadAnother.m3(); //80
	n2.m4(); //90
}
}