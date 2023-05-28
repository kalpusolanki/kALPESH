package array;

public class sample2 
{
	   public static void main(String[] args) 
       {
			//step 1 array declaration
       	String ar[] =new String [5];
       			
       //step 2 array initialization
       			
       			ar [0] ="ganesh";
       			ar [1] ="bajrang";
//       			ar [2] ="ritesh";
//       			ar [3] ="ganpat";
//       			ar [4] ="ramesh";
       			
       			//step 3 array usage       // if  array index not present then its show null
       			                           // but have to declare final index before in array declaratrion
       			System.out.println(ar[4]);
       				
       			
       			System.out.println("print all information from string arry");
       			

       	for(int i =0;i<=ar.length-1;i++)
       	{
       		System.out.println(ar[i]);
       	}
       			
       		System.out.println("---------------------------");
       		
       		System.out.println(ar.length);  // for  final index
       }      		
}
