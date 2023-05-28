package nonstaticmethodcallfromsameclass;

public class globalvariable 
{ //Non static Non static global variable
           int N1 = 211;
    		public static void main(String[] args) 
           {
    	globalvariable O2 = new globalvariable();  // 1 and 2   //non static global variable call from same class
    				O2.S1();                                      //create object of same class
    				
    			System.out.println(O2.N1);	     //3               // object name.variable name in printing statement
    				
    		   //  O2.S2();	                     //4
    				                                               // one object is used when we have to call non static method in same class
    				                                                   // object name which is same .method name
    			
    			
    		globalvariableotherclass O3=new globalvariableotherclass();   //5
    			O3.M4();
         
           
           }
	public void S1()
	{
		System.out.println("42");                           //U can call global variable in other method directly in printing statement but thes method u have to call in main method thats why create an object in amin method
		
		System.out.println(N1);                                 // we direct call it global variable in any method via printing statement
	}
	
	public void S2() 
	{
		System.out.println("43");
	}
}
