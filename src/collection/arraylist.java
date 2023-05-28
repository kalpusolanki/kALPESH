package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist 
{
public static void main(String[] args) 
{
//	ArrayList a1 =new ArrayList();  //default value 10
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
	System.out.println(a1.size());
	System.out.println(a1.isEmpty());
	System.out.println(a1.get(2));   // its a index
	System.out.println(a1.get(0));
	System.out.println(a1.get(4));
	System.out.println("=================================================");
	//add info between array list----> right shift operation

	a1.add(3, 600);
	System.out.println(a1.get(3));
	System.out.println(a1);
	System.out.println(a1.get(4));
	
	System.out.println("==================================================");
	//remove info between array list---->left shift operation
	a1.remove(3);
	System.out.println(a1.get(3));
//	System.out.println(a1);
	System.out.println(a1.get(4));

	System.out.println("=========print data using iterator cursor=============");
	Iterator itr =a1.iterator();// yahape arraylist ka data a1 me stored hai wo iterator method jo array list ka hai usko call karne ke bad hame iterator form mre return karta hai jo ham itr nam ke object me stored karte hai
	// arraylist object name gives return in types of iterator which of arraylist stored in object of itr
	//of Iterator interface
	
	// for data fetch we using while loop 
	while(itr.hasNext())              // if its true then visit the body
		{
			System.out.println(itr.next());	// its only print values int he itr object
		}
	System.out.println("=========print data using List iterator cursor =============");
	
	ListIterator litr =a1.listIterator();// yahape arraylist ka data a1 me stored hai wo listiterator method jo array list ka hai usko call karne ke bad hame listiterator form mre return karta hai jo ham l itr nam ke object me stored karte hai
	while(litr.hasNext())              // if its true then visit the body
	{
		System.out.println(litr.next());	// its only print values int he itr object
	}
	
	System.out.println("=========print data using for loop =============");
	for(int i=0;i<=a1.size()-1;i++)
	{
		System.out.println(a1.get(i));
	}
	System.out.println("=========print data using for each loop =============");
	
	for(Object s1:a1)    // because in a1 data is heterogenous so its stored in object type no specific data type
	{
	  
		System.out.println(s1);
	}
	
	 System.out.println("-------------------------------------");
	System.out.println(a1);
	
	a1.remove(3);
	
	System.out.println(a1);
	
	// update r modify data
	a1.set(3, "kalpesh");
	System.out.println(a1);
	
	System.out.println("============== for sort===================");
	// not sorted due to one parameterized needed while declaring array
	
	
//	Collections.sort(a1);
//
//	Iterator gh =a1.iterator();
//	while(gh.hasNext())
//	{
//		System.out.println(gh.next());
//	}

}
}
