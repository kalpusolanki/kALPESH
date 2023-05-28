package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset 
{
public static void main(String[] args)
{
	TreeSet tr =new TreeSet();

	tr.add("kalpesh");
	tr.add("ramesh");
	tr.add("rakhi");
	tr.add("heena");
	tr.add("Krishna"); // order of insertion ascending,homogenous.and not allow duplicate data and null value
	tr.add("bajrang");
	tr.add("jayesh");
	tr.add("Rrjun");
	tr.add("Arjun");
	tr.add("null");

	System.out.println(tr);
	
	System.out.println(tr.isEmpty());
	System.out.println(tr.size());
	
	tr.remove("Rrjun");
	System.out.println(tr);
	
	System.out.println(tr.first());
	System.out.println(tr.last());    // two method extra  in treeset (first and last)
	
	tr.pollFirst() ;        // remove first object in treeset using poll method
	tr.pollLast();         // these two method only in tree set
	System.out.println(tr);
	
	System.out.println("===================================================");
	//arraylist data reqired in ascending order without duplicate and null value with homogenous data only then its possible
	
Iterator it =tr.iterator();
	while(it.hasNext())
	{System.out.println(it.next());
		
	}
	System.out.println("====================================================");
	for(Object s1:tr) 
	{
		System.out.println(s1);
	}
	
	
	
}
}
