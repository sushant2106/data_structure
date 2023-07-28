import java.util.*;

public class Main
{
	public static void main(String[] args) {
	  int arr[]={2, 5, 6};
	  int k=10;
	  int i=0,j=0;
	  int n=arr.length,sum=0;
	  int count=0;
	  while(j<n){
	      sum+=arr[j];
	      if(sum<k){
	         count++;
	         j++;
	      }
	      else if(sum>=k){
	          while(sum>=k){
	              sum-=arr[i];
	              i++;
	              if(sum<k){
	                  count++;
	              }
	          }
	          if(sum<k){
	               count++; 
	          }
	          j++;
	      }
	  }
	  System.out.println(count);
	}
}
