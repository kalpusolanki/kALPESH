package variables;

 public class Datatype
{
	public static void main(String[] args)              //main method declaration
   {                                                   //main method body
	 //1. variable declaration      (allocation/reserved memory)
	
	 String stname;
	 int strollno;
	 long stmobno;                 //data type variable
	 float stperc;
	 char stgrade;
	 
	 
	 //2. Variable initialisation     (assigning/inserting value)
	  stname = "Rajesh kuumar";
     strollno = 55006809;
     stmobno = 8888545933l;           //VARIABLE NAME = variable value
     stperc=99.56f;
     stgrade ='A';
     
     
     //VARIABLE USAGE

	  System.out.println("Student Name  ="+stname);
	  System.out.println("Student roll no ="+strollno);
	  System.out.println("mob No = "+ stmobno);                      //info reuse
	  System.out.println("Student Percentage ="+stperc +"%");
	  System.out.println("Student grade ="+stgrade); 
	  System.out.println(263876);     
      System.out.println(stperc);  //not initiated the data value to data name.
	  
}
	

}
