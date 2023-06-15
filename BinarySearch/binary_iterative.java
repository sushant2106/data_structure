import java.util.*;

public class Main
{  
    static int binary(int arr[],int l,int h){
        int tar=5;
		while(l<=h){
		    int mid=l+(h-l)/2 ;
		    if(arr[mid]==tar){
		        return mid;
		    }
		    else if(arr[mid]>tar){
		        h=mid-1;
		    }
		    else{
		        l=mid+1;
		    }
		}
		return -1;
    }
	public static void main(String[] args) {
		int arr[]={1,2,4,7,11};
		int l=0;
		int h=arr.length-1;
		System.out.println(binary(arr,l,h));
	   
	}
}
