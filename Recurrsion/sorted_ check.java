import java.util.*;

public class Main
{  static boolean sort_check(int arr[],int n,int i){
         if(i<n-1){
             if(arr[i+1]<arr[i]){
                 return false;
             }
            return sort_check(arr,n,i+1);
         }
         return true;
     }
	public static void main(String[] args) {
         int arr[]={1,2,3,11,4,5,6,7};
         System.out.println(sort_check(arr,arr.length,0));
	}
}
