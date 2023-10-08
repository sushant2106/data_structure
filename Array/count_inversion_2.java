import java.util.*;
public class Main
{ 
   
    static int merge_sort(int arr[],int l,int mid,int h){
    int left=l;
    int right=mid+1;
    int temp[]=new int[h-l+1];
    int i=0;
    int count=0;
    while(left<=mid && right<=h){
        if(arr[left]>arr[right]){
           temp[i++]=arr[right++];
         
            count+=(mid-left+1);
        }
        else{
            temp[i++]=arr[left++];
        }
    }
    while(left<=mid){
      
         temp[i++]=arr[left++];
    }
    while(right<=h){
         temp[i++]=arr[right++];
    }
    i=0;
    int k=l;
    for(;i<temp.length;i++){
        arr[k++]=temp[i];
    }
  //  System.out.println(Arrays.toString(arr));
    return count;
    
}
    static int solve(int arr[],int l,int h){
        int count=0;
        if(l<h){
            int mid=l+h>>1;
           count+=solve(arr,l,mid);
            count+=solve(arr,mid+1,h);
           count+=merge_sort(arr,l,mid,h);
        }
        return count;
       
    }
	public static void main(String[] args) {
		int arr[]={8, 4, 2, 1};
		int count=solve(arr,0,arr.length-1);
		System.out.println(count);
		
	}
}
