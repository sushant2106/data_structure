import java.util.*;

public class Main
{
    
    static int check(int arr[],int k){
        int l=0;
        int h=arr.length-1;
        int count=0;
        while(l<h){
            int sum=arr[l]+arr[h];
            if(sum==k){
                l++;
                h--;
                count++;
            }
            else if(sum>k){
                h--;
            }
            else{
                l++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		int arr[]={1,2,6,6,5};
		Arrays.sort(arr);
		int n=arr.length;
		int max=0;
		for(int i=0;i<n;i++){
		    int l=i;
		    int h=n-1;
		    while(l<h){
		       int num=check(arr,l+h);
		       h--;
		       max=Math.max(max,num);
		    }
		}
		System.out.println(max);
	}
}
