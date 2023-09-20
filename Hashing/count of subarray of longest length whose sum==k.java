import java.util.*;
public class Main{
    static int solve(int arr[],int minlen,int reqsum){
        int count=0,sum=0;
        int j=0,i=0,n=arr.length;
        while(j<n){
            sum+=arr[j];
            if((j-i+1)>=minlen ){
            if((j-i+1)==minlen && sum==reqsum){
              count++;
              }
              sum-=arr[i];
              i++;
        }
          j++;
        }
        return count;
    }
     public static void main(String []args){
        int arr[]={-8,-8,-3,8,2,3};;
        int k=5;
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                minlen=Math.min(minlen,i+1);
            }
            if(map.containsKey(sum-k)){
                minlen=Math.min(minlen,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        
        System.out .println(solve(arr,minlen,k));
     }
}
