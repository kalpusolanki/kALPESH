package diffbetwstatandnonstat;

public class resultsample1 
{
public static void main(String[] args) 
{
	
	sample1 O1 =new sample1();
	O1.empname ="Kalpesh";         
	O1.Empcode = 55006809;                                  // nonstatic variable into static - object name of that calsse.variable of nonstatic name .
	O1.manager = "Yash";
	O1.orghead= "Abhishek";
	O1.mobno = 8888545933l;
	sample1.emermobno = 9421726537l; //fire                 //static variable into satic class name .varaiable name
	sample1.Owner = "Rajesh seth";                                      
	
	
	
	sample1 O2 =new sample1();
	O2.empname ="haider";
	O2.Empcode = 55006909;
	O2.manager = "baloioram";                                     //// nonstatic variable into static - object name of that calsse.variable of nonstatic name 
	O2.orghead= "Abhishek";
	O2.mobno = 99985459337l;
	sample1.emermobno = 9421726537l; //fire
	sample1.Owner = "Rajesh seth";                                //static variable into satic class name .varaiable name
	
	
	

	sample1 O3 =new sample1();
	O3.empname ="mitang";
	O3.Empcode = 55005409;
	O3.manager = "Divyesh";                                     //// nonstatic variable into static - object name of that calsse.variable of nonstatic name 
	O3.orghead= "sarvanand";
	O3.mobno = 9678959337l;
	sample1.emermobno = 942186549; //safety
	sample1.Owner = "kalpeshseth";                                //static variable into satic class name .varaiable name
	
        O1.Emdata();
        O2.Emdata();
        O3.Emdata();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
