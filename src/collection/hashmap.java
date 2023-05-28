package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmap 
{
public static void main(String[] args) 
{
	HashMap<String, Integer> map =new HashMap<String, Integer>();
	
	map.put("india", 120);
	map.put("china", 240);
	map.put("india", 360);
	map.put("india", 420); // only take one key and their latest reinitialize value
	map.put("Usa", 1900);
	map.put("turkey", 1900);
	map.put("Afg", 1900);
	map.put("nep",0);
	
	System.out.println(map);
	
	if(map.containsKey("india"))
	{
		System.out.println("key is present" );
	}
	else
	{
		System.out.println("key is not present" );
	}
	System.out.println(map.get("nep"));
	System.out.println(map.get("Afg"));
	
	// iteration of hashmap
	//map-interface,Entry interface
	for(Entry<String, Integer> e:map.entrySet())
	{System.out.print(e.getKey()+"  ");
	System.out.println(e.getValue());
		
	}
	
}
}
