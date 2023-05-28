package collection;

import java.util.TreeSet;

public class generic_exampleof_treeset 
{
public static void main(String[] args) 
{
	TreeSet<String> tr =new TreeSet<String>();
	tr.add("kalpesh");
	tr.add("Hanuman");
	tr.add("ramesh");
	tr.add("gaju");
	tr.add("Gaju");
	
	for(Object s1:tr)
	{
		System.out.println(s1);
	} 
	// on ascenging,no null,no duplicate,balanced tree, return only string when we parameterized generic
}
}
