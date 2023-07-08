import java.util.*;

public class Main
{
	public static void main(String[] args) {
    int arr[]={1, 2, 3, 3, 2, 3, 2, 3, 3};
    int n=arr.length;
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<n;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],1+map.get(arr[i]));
        }
        else{
            map.put(arr[i],1);
        }
    }
    int sum=0;
    Set<Integer>set=map.keySet();
    for(Integer x:set){
        int freq=map.get(x);
        if(freq>=x){
            sum+=x;
        }
    }
    System.out.println(sum);
	    
	}
}
