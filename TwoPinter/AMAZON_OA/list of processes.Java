import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[]={10,4,8,15,16,13,20};
		int m=2;
		int i=0,j=0,n=arr.length,max=-1,sum=0;
	   int total=0;
	  for(int k=0;k<n;k++){
	      total+=arr[k];
	  }
		while(j<n){
		    sum+=arr[j];
		    if(j-i+1<m){
		        j++;
		    }
		    else if(j-i+1==m){
		        max=Math.max(sum,max);
		        sum-=arr[i];
		        i++;
		        j++;
		    }
		}
		System.out.println(total-max);
		
	}
}
