import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]={4,2,1,3};
		int l=0,h=0;
		int n=arr.length;
		Arrays.sort(arr);
		int k=1;
		while(l<n && h<n){
		    if(Math.abs(arr[h]-arr[l])==k){
		    System.out.print(arr[l]+" "+arr[h]);
		    System.out.println();
		    l++;
		    h++;
		}
		else if(arr[h]-arr[l]>k){
		    l++;
		}
		else{
		    h++;
		}
		}
	}
	
}
