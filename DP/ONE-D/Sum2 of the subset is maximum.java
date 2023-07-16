import java.util.*;

public class Main
{
	public static void main(String[] args) {
	 int arr1[]={1,5,3,21234};
	 int arr2[]={-4509,200,3,40};
	  int n=4;
	  int dp[]=new int[n];
	  
	  dp[0]=Math.max(Math.max(arr1[0],arr2[0]),0);
	  dp[1]=Math.max(Math.max(arr1[1],arr2[1]),dp[0]);
	  for(int i=2;i<n;i++){
	      dp[i]=Math.max(Math.max(arr1[i],arr2[i])+dp[i-2],dp[i-1]);
	  }
	  System.out.println(dp[n-1]);
	  
	}
}
