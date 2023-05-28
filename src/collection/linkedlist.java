package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist
{
public static void main(String[] args) 
{
LinkedList ll =new LinkedList();
ll.add("kalpesh");
ll.add(536);
ll.add(2.26f);
ll.add('C');
ll.add("null");
ll.add(2.256894d);


System.out.println(ll);
System.out.println(ll.isEmpty());
System.out.println(ll.size());
System.out.println(ll.get(2));

System.out.println("===========for iterator==========================");

 Iterator it =ll.iterator();
while(it.hasNext()) 
{
	System.out.println(it.next());
	}
    
System.out.println("==============for listiterator==================================");
ListIterator lit =ll.listIterator();

while(lit.hasNext())
{
	System.out.println(lit.next());
}

System.out.println("============= for loop======================================");
for(int i=0 ;i<=ll.size()-1;i++)
	
{
	System.out.println(ll.get(i));
	}

System.out.println("=========================for each loop ======================");

for (Object s1 : ll)
{
	System.out.println(s1);
	}
System.out.println("====================== add index nt remove to right===================");

ll.add(4, 8888);
System.out.println(ll);
ll.set(5, "jiju");
System.out.println(ll);
ll.clear();
System.out.println(ll);

System.out.println("===========for enumeration==============");
// check for enumeration
// exception = java.lang.ClassCastException cannot convert from  cast to class java.util.Enumeration to collection.linkedlist.main
Enumeration enu = (Enumeration) ll.element();
 while(enu.hasMoreElements())
 {
	 System.out.println(enu.nextElement());
 }




}
}
