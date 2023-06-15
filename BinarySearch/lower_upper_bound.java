import java.util.*;

public class Main
{   static int tar=5;
    static int binary(int arr[],int l,int h){
        int max=-1;
        int max2=-1;
      while(l<=h){
          int mid=l+(h-l)/2 ;
          if(arr[mid]==tar){
              return mid;
          }
          else if(arr[mid]>tar){
              max2=Math.max(max2,mid);
              h=mid-1;
          }
          else{
              max=Math.max(max,mid);
              l=mid+1;
          }
      }
      System.out.println(arr[max2]);
      return max;
    }
	public static void main(String[] args) {
		int arr[]={1,2,4,7,11};
		int l=0;
		int h=arr.length-1;
		System.out.println(binary(arr,l,h));
	   
	}
}
