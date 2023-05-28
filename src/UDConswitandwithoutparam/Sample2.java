package UDConswitandwithoutparam;

public class Sample2 
{
int num1;                                       // variable declaration
int num2;

        Sample2()                               //user defined constructor
     {
     num1 = 24;                                 // variable initialization                    
     num2 = 26;
     }
// use 1 --> initialize global variable
// use 2----> copy/load all data into object

public static void main(String[] args) 
{   
	K3();
	
	Sample2 O1 = new Sample2();            // create new object O1 
	O1.K1();                                // main method object creation range is in whole class and reuse 
	O1. K2();                               // for any non static method call within class
}
// step 3 ---> usage
public void K1() 
{
	System.out.println(num1);
}
public void K2() 
{
	System.out.println(num1+num2);
}
// Step 3------> Usage
public static void K3()
{
	
	Sample2 O2 = new Sample2();          // to create an object O2 to user defined constructor call 
	                                     // ( limit range within class)
	System.out.println(O2.num1);
}
}
