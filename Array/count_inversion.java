import java.util.*;

public class Main
{    
    static int count=0;
    static void merge_Sort(int arr[],int l,int mid,int h){
        int left=l;
        int right=mid+1;
        int k=0;
        int temp[]=new int[h-l+1];
        while(left<=mid && right<=h){
            if(arr[left]>arr[right]){
                temp[k++]=arr[right++];
                count+=(mid-left+1);
            }
            else{
                temp[k++]=arr[left++];
            }
        }
       
        while(left<=mid){
             temp[k++]=arr[left++];
        }
         while(right<=h){
             temp[k++]=arr[right++];
        }
        //copying temporary array into old array
        int i=l;
        for(k=0;k<temp.length;k++){
            arr[i++]=temp[k];
        }
        
    }
    static void merge(int arr[],int l,int h){
        if(l<h){
            int mid=(l+(h-l)/2);
            merge(arr,l,mid);
            merge(arr,mid+1,h);
            merge_Sort(arr,l,mid,h);
        }
    }
	public static void main(String[] args) {
		int arr[]={4, 3, 2, 1};
		int n=arr.length;
		merge(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}
}
