package accesspecifier1;

import accesspecifierprotected.sample2;

public class prtecteddiffclass extends sample2
{

public static void main(String[] args) 
{
	sample2 O23 = new sample2();  // public method executed through import from other package no need to inheritance
	O23.M3();
//	O23.M4();           // protected method in public method executed by calling public method
	                       // but protected method not executed without import
	
//	to call M4(); we need to create seperate oject
	
	prtecteddiffclass n1 =new prtecteddiffclass();
	n1.M4();
}
}
