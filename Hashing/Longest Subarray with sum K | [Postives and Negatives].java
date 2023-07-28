import java.util.*;

public class Main
{
	public static void main(String[] args) {
		  int[]arr={ -1, 1, 1};
        int k = 1;
        int sum=0;
        int n=arr.length;
        int len=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                len=Math.max(i+1,len);
            }
            if(map.containsKey(sum-k)){
                int curr=i-map.get(sum-k);
                len=Math.max(curr,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
           
        }
      System.out.println(len);
        
	}
}
