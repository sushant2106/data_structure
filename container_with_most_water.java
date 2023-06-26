import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[]={1,8,6,2,5,4,8,3,7};
	     	int n=arr.length;
		int max=Integer.MIN_VALUE;
		for(int i=n-1;i>=0;i--){
		    for(int j=0;j<i;j++){
					int prd=1;
		      if(arr[j]>=arr[i]){ 
		         prd=(i-j)*arr[i];
		      }
					else{
             prd=(i-j)*arr[j];
					}
					 max=Math.max(max,prd);  
		    }
		}
		System.out.println(max);
	}
}
