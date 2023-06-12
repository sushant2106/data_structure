import java.util.*;

public class Main
{  
    static int index=-1;
    static int srch=5;
    static int  first_ocu(int arr[],int n,int i){
         if(i<n){
             if(arr[i]==srch){
                 return i;
             }
             return first_ocu(arr,n,i+1);
         }
         return -1;
     }
	public static void main(String[] args) {
         int arr[]={1,2,3,5,11,4,5,6,7};
         System.out.println(first_ocu(arr,arr.length,0));
	}
}
