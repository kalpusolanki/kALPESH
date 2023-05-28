package array;

public class ArrayTest2_SingleDiamentionalArray 
{
	public static void main(String[] args)
	{
	int i[]=new int[5];
	i[0]=10;
	i[1]=20;
	i[2]=30;
	i[3]=40;
	i[4]=60;
	
	
	String s[]=new String[5];
	s[0]="Sidharth";
	s[1]="Tanuja";
	s[2]="Arohoi";
	s[3]="Mahi";
	s[4]="Kiran";
	
	for(int j=0;j<=i.length-1;j++)
	{
	
	System.out.println(i[j]);
	for(int k=0;k<=s.length-1;k++)
	{
	System.out.print(s[k]+"   ");
	}
	System.out.println(" ");
	}
	}
}
