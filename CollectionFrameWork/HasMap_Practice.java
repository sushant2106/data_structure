import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    HashMap<String,Integer>map=new HashMap<>();
	    map.put("ram",1);
	    map.put("Shyam",12);
	    map.put("ghansyam",34);
	    System.out.println(map.containsKey("ram"));

	    for(Map.Entry<String,Integer>arr:map.entrySet()){
	          System.out.println(arr.getKey()+" "+arr.getValue());
	    }
	    HashMap<Integer,Integer>map2=new HashMap<>();
	    
	    int arr[]={1,2,3,1,4,3};
	    for(int i=0;i<arr.length;i++){
	        if(map2.containsKey(arr[i])){
	            map2.put(arr[i],1+map2.get(arr[i]));
	        }
	        else{
	             map2.put(arr[i],1);
	        }
	    }
	    
	    for(Map.Entry<Integer,Integer>x:map2.entrySet()){
	        System.out.println(x.getKey()+" "+x.getValue());
	    }
	    
	    
	    
	}
}
