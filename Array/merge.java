import java.util.*;

public class Main
{
    static void mergee(int arr[],int arr2[],int arr3[]){
        int k=0;
        int i=0;
        int j=0;
        while(i<arr.length && j<arr2.length){
            if(arr[i]>arr2[j]){
                arr3[k++]=arr2[j++];
            }
            else{
                arr3[k++]=arr[i++];
            }
        }
        while(j<arr.length){
            arr3[k++]=arr2[j++];
        }
         while(i<arr.length){
            arr3[k++]=arr[i++];
        }
        
    }
	public static void main(String[] args) {
	    int arr[]={2,8,15,18};
	    int arr2[]={5,9,12,17};
	    int arr3[]=new int[arr.length+arr2.length];
	    mergee(arr,arr2,arr3);
	    System.out.println(Arrays.toString(arr3));
	}
}
