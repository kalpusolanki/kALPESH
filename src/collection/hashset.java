package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hashset
{
public static void main(String[] args) 
{
	HashSet hs=new HashSet();
	hs.add("rahul");
	hs.add("101");
	hs.add("22.5f");
	hs.add("22.5f");         // no duplicate value only one null and unorganized , organized through ascii number 
	hs.add("null");         // storage type hashtable
	hs.add("null");
	
	System.out.println(hs);
	System.out.println(hs.isEmpty());
	System.out.println(hs.size());
	
	
	hs.remove("rahul");
	System.out.println(hs);
	System.out.println("=====================================================");
	Iterator itr=hs.iterator();
	// iterator is an interface here we dont create object of interface we only call the iterator method of that interface with referance to collection class annd stored in form of retuned iterator
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("====================================================");
	for(Object a:hs)
	{
		System.out.println(a);
		}
	System.out.println("=================for loop=================");
//	
//	for(int i=0;i<=hs.size()-1;i++)
//	{
//		System.out.println(hs.get(i)); // here data stored in table form thats why we not get through get method in set int the form of index
//	}
System.out.println("=====================================================");
	hs.clear();
	hs.size();
	
	
	// it is usefull when no duplicate required and order not maintained
	System.out.println("====================================================");
	ArrayList a1 =new ArrayList(); // initial capacity 8
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
	HashSet hf=new HashSet(a1);
	System.out.println(hf);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
