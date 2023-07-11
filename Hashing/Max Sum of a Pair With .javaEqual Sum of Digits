import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[]={42, 33, 60};
		int max=-1;
		HashMap<Integer,Integer>map=new HashMap<>();
	   for(int i=0;i<arr.length;i++){
	    int num=arr[i];
	    int sum=0;
		while(num>0){
		    sum+=num%10;
		    num=num/10;
		    if(sum>9 && num==0){
		        num=sum;
		        sum=0;
		    }
		}
	    if(map.containsKey(sum)){
	        int curr_sum=arr[i]+map.get(sum);
	        if(curr_sum>max){
	            max=curr_sum;
	        }
	        if(arr[i]>map.get(sum)){
	            map.put(sum,arr[i]);
	        }
	        
	    }
	    else{
	         map.put(sum,arr[i]);
	    }
	   }
		
	 System.out.println(max);
	 
	 
	}
}
