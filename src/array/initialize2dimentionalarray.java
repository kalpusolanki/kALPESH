package array;

public class initialize2dimentionalarray 
{
	 public static void main(String[] args) {
	        //two dimensional array definition  
	        int myarray[][]  = new int[3][3];
	        
	        
	        System.out.println(myarray.length);
	        
	        //printing the 2-d array
	        System.out.println("The two-dimensional array:");
	        for (int i = 0; i <myarray.length; i++) {
	            for (int j = 0; j <myarray [i].length; j++) {
	                myarray[i][j] = j+1; 
	                //assign value to each array element
	 
	                System.out.print(myarray[i][j] + " ");
	            }
	            System.out.println("");
	        }
	    }
}
