import java.util.*;

public class Main
{  
    static int pivot(int arr[]){
         int l=0;
	   int h=arr.length-1;
	   while(l<h){
	       int mid=l+(h-l)/2 ;
	       if(arr[mid]>=arr[0]){
	           l=mid+1;
	       }
	       else{
	           h=mid;
	       }
	   }
	   return l;
    }
	public static void main(String[] args) {
	   int arr[]={7,9,1,2,3};
	  
	   System.out.println(pivot(arr));
	}
}
