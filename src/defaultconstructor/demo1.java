package defaultconstructor;

public class demo1 
{
 int a = 26;
 
 int b = 42;
 
 public static void main(String[] args) 
 
 {
	 demo1 O1 =new demo1();
	 O1.add(10,25);
	 
	 O1.Div (5,5);
	 
}
 
 public void add(int c,int d)                   //addition of local variable with global variable
 {
	System.out.println((a+b)+(c+d));
}
 public void Div(int c,int d) 
 {
	System.out.println((b-a)/(c+d));           //division of dlobal variable to additon of local variable in default construcor
	
}
}
