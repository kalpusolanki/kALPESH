package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhasset 
{
public static void main(String[] args) 
{
	LinkedHashSet lhs =new LinkedHashSet();
	lhs.add("kalpesh");
	lhs.add("null");
	lhs.add("null");
	lhs.add("kalpesh");
	lhs.add(22.5f);
	lhs.add(101);
	lhs.add('A');
	
	System.out.println(lhs);
	System.out.println(lhs.isEmpty());
	System.out.println(lhs.size());
	lhs.remove("null");
  
	Iterator itr=lhs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("===================================================");
	
	for(Object s1:lhs)
	{
		System.out.println(s1);
	}
	// advantage no duplicate and order of insertion maintained
	
	ArrayList a1 =new ArrayList(8); // initial capacity 8
	a1.add("rahul");
	a1.add(101);
	a1.add(2.5f);
	a1.add(2.5f);
	a1.add('B');
	a1.add(null);
	a1.add(null);
	a1.add(null);
	a1.add(null);
	
	System.out.println(a1);
	LinkedHashSet lhsg =new LinkedHashSet(a1);
	System.out.println(lhsg);
	
}
}
