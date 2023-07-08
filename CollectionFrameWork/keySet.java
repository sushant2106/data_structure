import java.util.*;

public class Main
{
	public static void main(String[] args) {
		HashMap<String,Integer>map=new HashMap<>();
		map.put("ram",123);
	    map.put("shyam",43);
	    map.put("Ghnshayam",14);
	    Set<String>key=map.keySet();
	    System.out.println(key);
	    for(String x:key){
	        System.out.print(x+" ");
	    }
	    System.out.println();
	    
	   
	    
	}
}
