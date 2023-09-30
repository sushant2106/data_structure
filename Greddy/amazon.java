import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]={100,1,2};
		int n=arr.length;
		int prev=arr[0];
		int count=0,j=1;
		int curr=0;
		while(j<n){
		   curr+=arr[j];
		   if(curr>=prev){
		       prev=curr;
		       curr=0;
		   }
		   else{
		       count++;
		   }
		   j++;
		}
	 if(curr==0){
	     System.out.println(n-count);
	 }
	 else{
	     count++;
	     if(count==n){
	           System.out.println(1);
	     }
	     else{
	          System.out.println(n-count);
	     }
	   
	 }
	}
}
