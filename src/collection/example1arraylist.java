package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class example1arraylist 
{
public static void main(String[] args) 
{
	ArrayList<String> s1 = new ArrayList<String>();
s1.add("kalpesh");
s1.add("hanuman");
//s1.add(null);
//s1.add(101);
s1.add("jhgnm");
	

System.out.println(s1);
//
//for( Object s2:s1)
//{
//	String s = (String) s2;
//	}

Collections.sort(s1);

Iterator it =s1.iterator();
while(it.hasNext())              // if its true then visit the body
{
	System.out.println(it.next());	// its only print values int he itr object
}

}
}
