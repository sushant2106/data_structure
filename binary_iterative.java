import java.util.*;

public class Main
{   static int tar=5;
    static int binary(int arr[],int l,int h){
      if(l>h){
          return -1;
      }
      int mid=l+(h-l)/2 ;
      if(arr[mid]==tar)return mid;
      else if(arr[mid]>tar)return binary(arr,l,mid-1);
      return binary(arr,mid+1,h);
    }
	public static void main(String[] args) {
		int arr[]={1,2,4,7,11};
		int l=0;
		int h=arr.length-1;
		System.out.println(binary(arr,l,h));
	   
	}
}
