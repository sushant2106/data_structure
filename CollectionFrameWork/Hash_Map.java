import java.util.*;

public class Main
{
	public static void main(String[] args) {
		HashMap<String,Integer>arr=new HashMap<>();
		arr.put("ram",1);
		arr.put("aam",2);
		arr.put("shyam",3);
		//arr.put("ram",1);
		System.out.println("before:"+arr);
		System.out.println(arr.get("ram"));
		System.out.println(arr.containsKey("aam"));
		//to update the value of HashMap
		arr.put("ram",10);
	//	arr.remove(key);
		System.out.println("After :"+arr);
		
		System.out.println("Convert into set....");
		Set<String>s=arr.keySet();
		var set2=arr.values();
		var set3=arr.entrySet();
		System.out.println(s);
	    System.out.println(set2);
	    System.out.println(set3);
	}
}
