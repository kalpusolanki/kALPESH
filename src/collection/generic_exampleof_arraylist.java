package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class generic_exampleof_arraylist 
{
public static void main(String[] args)
{
	Vector<Integer>ar =new Vector<Integer>();
	ar.add(101);
	ar.add(201);
	ar.add(201);
	ar.add(null);
	ar.add(null);
	
	Enumeration<Integer>en=ar.elements();
	while(en.hasMoreElements())
	{
		System.out.println(en.nextElement());
	}
	//order of insertion maintained and allow any no null values but return type only integer
}
}
