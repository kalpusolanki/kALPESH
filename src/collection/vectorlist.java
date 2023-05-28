package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vectorlist 
{
public static void main(String[] args) 
{
	Vector v =new Vector();
	v.add("kalpesh");
	v.add(121);
	v.add('A');
	v.add(22.5f);
	v.add("null");
	v.add("null");
	
	System.out.println(v);
	System.out.println(v.isEmpty());
	System.out.println(v.get(3));
	System.out.println("===============add in index===================");
	
	//add info between vectorlist..
	v.add(2, 121.6f);
	System.out.println(v);
	
	System.out.println("================iterator==================");
	
	//print data using iterator cursor
	Iterator itr=v.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("===============list iteration===================");
	
	ListIterator ltr=v.listIterator();
	while(ltr.hasNext())
	{
		System.out.println(ltr.next());
	}
	System.out.println("=============enumeration=====================");
	
	// enumeration done only in vector list
	 Enumeration enu =v.elements();
	             while(enu.hasMoreElements()) 
	             {
	            	 System.out.println(enu.nextElement());
	             }
   System.out.println("============for loop======================");
	
   for(int i=0;i<=v.size()-1;i++) 
   {
	   System.out.println(v.get(i));
   }
   System.out.println("=============for each=====================");
   for(Object s1:v)
   {
	 System.out.println(s1);  
   }
   System.out.println("===========================================");
   
	v.remove(2);
	System.out.println(v);
	
	v.set(2, 900);
	
	System.out.println(v);
	
	v.clear();
	System.out.println(v);
	
}
}