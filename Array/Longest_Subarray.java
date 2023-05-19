import java.util.*;
public class Main{
    public static void main(String args[]){
        int arr[] = {2,3,5,1,9};
        int n=arr.length;
        int sum=10;
       
        int maxi=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 int arr_sum=0;
                for(int k=i;k<=j;k++){
                    arr_sum+=arr[k];
                    System.out.print(arr[k]+" ");
                }
                if(arr_sum==sum){
                   maxi=Math.max(maxi,(j-i+1));
                }
                System.out.println();
            }
        }
        System.out.println("length_longest_subarray:"+maxi);
    }
}
