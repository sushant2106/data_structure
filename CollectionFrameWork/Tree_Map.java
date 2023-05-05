import java.util.*;

public class Main
{
	public static void main(String[] args) {
		     TreeMap<Integer,String>map=new TreeMap<>();
		map.put(5,"ram");
		map.put(6,"aka");
		map.put(2,"sachin");
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		var set1=map.entrySet();
		System.out.println(set1);
		System.out.println(map.get(5));
		
		System.out.println(map.containsValue(5));
		
		//put can also act as replace
		
		map.put(6,"amma");
		
		System.out.println("After the replace....");
		System.out.println(map);
		
		System.out.println("First.....last key");
		System.out.println(map.firstEntry());
		System.out.println(map.lastEntry());
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		System.out.println("To give firsteNTRY AND remove it also...");
		System.out.println(map.pollFirstEntry());
		
		System.out.println(map.pollLastEntry());
		
		
		
		 Iterator it=map.entrySet().iterator();
	  
	  while(it.hasNext()){
	      System.out.println(it.next());
	  }
		
	}
}
