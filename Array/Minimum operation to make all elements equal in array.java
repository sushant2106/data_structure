import java.util.*;

public class Main
{
	public static void main(String[] args) {
	int arr[]={1, 2, 3, 4};
	int min=arr[0];
	 int n=arr.length;
	 for(int i=0;i<n;i++){
	     min=Math.min(arr[i],min);
	 }
	 int maximum_count=0;
	 int minimum_count=0;
	 for(int i=0;i<n;i++){
	     if(arr[i]==min){
	         continue;
	     }
	     else{
	         maximum_count+=(arr[i]-min);
	          minimum_count++;
	     }
	 }
	 System.out.println(maximum_count+" "+ minimum_count);
	    
	    
	}
}
