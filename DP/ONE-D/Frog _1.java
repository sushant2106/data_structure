import java.util.*;

public class Main
{
	public static void main(String[] args) {
	   int arr[]={30,10,60,10,60,50};
	   int n=arr.length;
	   int dp[]=new int[n];
	   dp[0]=0;
	   dp[1]=Math.abs(arr[1]-arr[0]);
	   
	   for(int i=2;i<n;i++){
	       int x=Math.abs(arr[i]-arr[i-1])+dp[i-1];//one step Coming
	       int y=Math.abs(arr[i]-arr[i-2])+dp[i-2];
	       dp[i]=Math.min(x,y);
	   }
	   
	   System.out.println(dp[n-1]);
	}
}
