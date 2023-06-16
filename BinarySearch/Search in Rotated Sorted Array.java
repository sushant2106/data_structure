import java.util.*;

public class Main
{  
    static int target=2;
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
    static int binary(int arr[],int l,int h){
       
        while(l<=h){
            int mid=l+(h-l)/2 ;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	   int arr[]={7,9,1,2,3};
	    int ind=pivot(arr);
	    int n=arr.length-1;
	    if(target>=arr[ind] && target<=arr[n]){
	     System.out.print(binary(arr,ind,n));
	    }
	    else{
	        System.out.print(binary(arr,0,ind-1));
	    }
	}
}
