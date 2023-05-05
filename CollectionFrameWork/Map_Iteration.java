import java.util.*;

public class Main
{
	public static void main(String[] args) {
        TreeMap<Integer,String>map=new TreeMap<>();
		map.put(5,"ram");
		map.put(6,"aka");
		map.put(2,"sachin");
		
	  
	        
	 for(Map.Entry<Integer,String>s : map.entrySet())
	 {
	     System.out.println(s.getKey()+" "+s.getValue());
	 }
		
		
		
	}
}
