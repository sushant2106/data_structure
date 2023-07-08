import java.util.*;

public class Main
{
	public static void main(String[] args) {
    int arr[]={1, 2, 3, 4, 5};
    int k=3;
    boolean flag=false;
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        if(!map.containsKey(arr[i])){
            map.put(arr[i],i);
        }
        else{
            int length=i-map.get(arr[i]);
            if(length<=k){
                flag=true;
                break;
            }
        }
    }
    if(flag){
        System.out.println(flag);
    }
    else{
        System.out.println(flag);
    }
    
	    
	    
	}
}
