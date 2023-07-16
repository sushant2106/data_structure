import java.util.*;
//Here we go :   Given an array of integers(positive as well as negative) ,select some elements from this array(select a subset) such that:-

//1. Sum of those elements is maximum(Sum of the subset is maximum) .

//2. No two elements in the subset should be consecutive.

Example :- {2,4,6,7,8}

Answer:- {2+6+8=16}
public class Main
{
	public static void main(String[] args) {
	  int arr[]={2,3,5,-8,7};
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
