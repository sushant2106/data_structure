import java.util.*;

public class Main
{
	public static void main(String[] args) {
	  int arr[]={1, 2, 1, 0, 1, 1, 0};
	  int k=4;
	  int i=0,j=0;
	  int n=arr.length,sum=0;
	  int max=0;
	  while(j<n){
	      sum+=arr[j];
	      if(sum<=k){
	        max=Math.max(j-i+1,max);  
	        j++;
	      }
	      else if(sum>k){
	          while(sum>k){
	              sum-=arr[i];
	              i++;
	          }
	          if(sum==k){
	               max=Math.max(j-i+1,max);  
	          }
	          j++;
	      }
	  }
	  System.out.println(max);
	}
