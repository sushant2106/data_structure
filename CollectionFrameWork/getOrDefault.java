import java.util.*;

public class Main
{
	public static void main(String[] args) {
		 HashMap<String, Integer>map=new HashMap<>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);
       
       int k=map.getOrDefault("b",500);
       System.out.println(k);
	    //ya toh b mai pehle se jo value store hai wo dega nahi 
    //toh jo bhi default value assign kiya hai wo dega
	    
	}
}
