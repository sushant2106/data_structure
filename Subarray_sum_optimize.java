import java.util.*;
public class Main{
    public static void main(String args[]){
        int arr[] = {2,3,5,1,9};
        int n=arr.length;
        int sum=10;
       
        int len=Integer.MIN_VALUE;
        int arr_sum=0;
        for(int i=0;i<n;i++){
            arr_sum=0;
            for(int j=i;j<n;j++){
              arr_sum+=arr[j];
              if(arr_sum==sum){
                  len=Math.max(len,(j-i+1));
              }
            }
        }
        System.out.println("length_longest_subarray:"+len);
    }
}
