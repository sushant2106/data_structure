import java.util.*;

public class Main
{
	public static void main(String[] args) {
	  int arr[]={2,-3,5,-8,7};
	  int n=5;
	  int dp[]=new int[n];
	  
	  dp[0]=Math.max(0,arr[0]);
	  dp[1]=Math.max(dp[0],arr[1]);
	  for(int i=2;i<n;i++){
	      dp[i]=Math.max(dp[i-2]+arr[i],dp[i-1]);
	  }
	  System.out.println(dp[n-1]);
	}
}
