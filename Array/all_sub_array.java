import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[]={10, 2, 3, 99, 12, 0};
		int n=arr.length;
		for(int i=0;i<n;i++){
		    for(int j=i;j<n;j++){
		         System.out.print("[");
		        for(int k=i;k<=j;k++){
		           System.out.print(arr[k]+",");
		        }
		         System.out.print("]\n");
		    }
		}
	}
}
