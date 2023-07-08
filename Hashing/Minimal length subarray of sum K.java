import java.util.*;

public class Main
{
	public static void main(String[] args) {
	  int  arr[]= {1, 2, 4, 3, 2, 4, 1}, k = 7 ;
	  int sum=0;
	  int length=Integer.MAX_VALUE;
	  HashMap<Integer,Integer>map=new HashMap<>();
	  map.put(0,0);
	  for(int i=0;i<arr.length;i++){
	      sum+=arr[i];
	      if(map.containsKey(sum-k)){
	          length=Math.min(length,i-map.get(sum-k));
	      }
	      map.put(sum,i);
	  }
	  System.out.println(length);
	  
	}
}
