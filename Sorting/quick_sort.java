import java.util.*;

public class Main
{ 
    static void swap(int arr[],int l,int h){
        int temp=arr[l];
        arr[l]=arr[h];
        arr[h]=temp;
    }
    static int partition(int arr[],int l,int h){
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(pivot>=arr[j]){
                i++;
        //  int temp=arr[j];
        //   arr[j]=arr[i];
        //  arr[i]=temp;
        swap(arr,i,j);
            }
        }
        i++;
    //   int temp= pivot;
    //     arr[h]=arr[i];
    //     arr[i]=temp;
    swap(arr,i,h);
        return i;
        
    }
    static void merge(int arr[],int l,int h){
       // if(l>=h)return;
        if(l<h){
            int mid=partition(arr,l,h);
            merge(arr,l,mid-1);
            merge(arr,mid+1,h);
            
        }
    }
	public static void main(String[] args) {
		int arr[]={9,3,7,5,6,4,8};
		int n=arr.length;
		merge(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
}
