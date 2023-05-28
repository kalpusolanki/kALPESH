package defaultconstructor;

public class Dcwithparameterdiffclass 
{


public static void main(String[] args)
{
	sub(2,6);
	
	Dcwithparameterdiffclass O1 =new Dcwithparameterdiffclass();
  O1.add(26, 29);
}

public void add(int c,int d) 
{
	System.out.println(c+d);
}
public static void sub(int d,int f)

{
	System.out.println(d-f);
}
}
