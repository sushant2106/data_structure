import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  int arr[]={10,4,8,15,16,13,20};
	  int m=2;
	  int maxsum=0;
	  int n=arr.length;
	  int total=0;
	  for(int i=0;i<n;i++){
	      total+=arr[i];
	  }
	  for(int i=0;i<=n-m;i++){
	      int sum=0;
	      for(int j=i;j<i+m;j++){
	      
	              sum+=arr[j];
	         
	      }
	      maxsum=Math.max(sum,maxsum);
	  }
	  System.out.println(total-maxsum);
        
	}
}
