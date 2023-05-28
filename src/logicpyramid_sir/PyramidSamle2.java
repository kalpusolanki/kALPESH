package logicpyramid_sir;

public class PyramidSamle2 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("_");
			}
			for(int k=1;k<=i ;k++)
			{
				System.out.print(" @");
			}
			System.out.println("");
		}
	}

}
