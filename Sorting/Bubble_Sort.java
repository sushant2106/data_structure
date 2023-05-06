import java.util.*;

public class Main
{   static void Bubble_sort__Increasing(int arr[])
  {
      
	   int n=arr.length;
	   for(int i=0;i<n;i++){
	       for(int j=i+1;j<n;j++){
	           if(arr[i]>arr[j]){
	           arr[i]=arr[i]+arr[j];
	           arr[j]=arr[i]-arr[j];
	           arr[i]=arr[i]-arr[j];
	               
	           }
	       }
	   }
	  for(int i=0;i<n;i++){
	      System.out.print(arr[i]+" ");
	  }
  System.out.print("\n");
	  
 }
   static void Bubble_sort__Decreasing(int arr[])
  {
      
	   int n=arr.length;
	   for(int i=0;i<n;i++){
	       for(int j=i+1;j<n;j++){
	           if(arr[i]<arr[j]){
	           arr[i]=arr[i]+arr[j];
	           arr[j]=arr[i]-arr[j];
	           arr[i]=arr[i]-arr[j];
	           }
	       }
	   }
	  for(int i=0;i<n;i++){
	      System.out.print(arr[i]+" ");
	  }

	  
 }
	public static void main(String[] args) {
	int arr[]={5,4,1,3,2};
	Bubble_sort__Increasing(arr);
	Bubble_sort__Decreasing(arr);
	    
	    
	}
}
