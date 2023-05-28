package collection;

import java.util.HashSet;
import java.util.Iterator;

public class example1 
{
public static void main(String[] args)   // with parameterized
{
	HashSet<Integer>hs =new HashSet<Integer>();
	hs.add(20);
	hs.add(25);
	hs.add(65);
	hs.add(99);
	hs.add(99);
	hs.add(null);
	hs.add(null);
//	hs.add("kalpesh")
	System.out.println(hs);
	
	Iterator<Integer>itr =hs.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
