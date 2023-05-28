package accesspecifierpublic;

public class sample11 
{
public int a;

public sample11()
{
	a=25;
}
public void M21() 
{
	System.out.println(a/a);
}


public static void main(String[] args)
{  sample11 O21 = new sample11();
	O21.M21();
	System.out.println(O21.a);
}
}
