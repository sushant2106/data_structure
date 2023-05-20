import java.util.*;

public class Main
{
	public static void main(String[] args) {
	  int arr[]={3,1,4,8,7,2,5};
	  int n=arr.length;
	  int max=arr[n-1];
	  int diff=0;
	  for(int i=n-1;i>=0;i--){
	      if(arr[i]<=max){
	         diff=Math.max(diff,(max-arr[i]));
	         //System.out.println(max);
	      }
	      else{
	          max=Math.max(max,arr[i]);
	         //  System.out.println(max);
	      }
	  }
	  System.out.println(diff);
	  
	
	
	}
}
