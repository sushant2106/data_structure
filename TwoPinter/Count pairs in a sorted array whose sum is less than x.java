import java.util.*;

public class Main
{
	public static void main(String[] args) {
	int arr[]={1, 2, 3, 4, 5, 6, 7, 8}, x=7;
         int l=0;
         int count=0;
         int h=arr.length-1;;
         int dif=Integer.MAX_VALUE;
         while(l<h){
             if(arr[l]+arr[h]<x){
                 count+=(h-l);
                 l++;
                 
             }
             else{
                 h--;
             }
             
         }
         
        System.out.println(count);
	}
}
