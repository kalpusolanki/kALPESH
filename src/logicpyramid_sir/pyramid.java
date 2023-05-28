package logicpyramid_sir;

public class pyramid 
{
public static void main(String[] args) 
{
	for (int i=1;i<=4;i++)   //row
    {
        for (int j=3;j>=i;j--)  //spaces 3 for column
        {
            System.out.print("a");
            
        }
        for (int k=1;k<=i;k++)  //star  for column as per row
        {
            System.out.print(" *"); 
            
         }
        System.out.println("");
 }
	    
}
}
