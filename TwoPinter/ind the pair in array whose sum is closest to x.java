import java.util.*;

public class Main
{
	public static void main(String[] args) {
	int arr[]={1, 3, 4, 7, 10}, x=15;
         int l=0;
         int h=arr.length-1;;
         int ans[]=new int[2];
         while(l<h){
             if(arr[l]+arr[h]<=x){
                 ans[0]=arr[l];
                 ans[1]=arr[h];
                 l++;
             }
             else{
                 h--;
             }
             
         }
         
        System.out.println(Arrays.toString(ans));
	}
}
