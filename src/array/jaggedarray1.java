package array;



public class jaggedarray1 
{
   public static void main(String[] args)
   {
	int b[][]=new int[5][];
	b[0]= new int [3];
	b[1] =new int [7];
	b[2]=new int [4]; 
	b[3]=new int [3];
	b[4]=new int [6];
	
	
	
//	   System.out.println(b[1].length);
//	System.out.println(b.length);
	 int count=0;
	 // data initialization
//	 for(int i=0;i<b.length;i++)
//		 for(int j=0;j<b[i].length;j++) // imp step to consider these rows length
//			 b[i][j]=count++;
	   
	   for  (int i=0;i<b.length;i++) 
	   {
		   for(int j=0;j<b[i].length;j++) 
		   {
			   b[i][j]=count++;
			  System.out.print(b[i][j]+"  ");
			 
		   }
		 
		   System.out.println();
	   }
	   
	   
	   
	   
	   
	   
}
}
