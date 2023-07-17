import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]={5,8,10};
		int k=3;
		int ans[]=new int[1000];
		int n=arr.length;
		int i=0;
		while(i<n){
		    
		    int l=arr[i]-k;
		    int r=arr[i]+k;
		    //index ka range aa rha hai  
		    ans[l]+=1;
		    ans[r]+=-1;
		    i++;
		}
		int max=0;
		for( i=1;i<1000;i++){
		    ans[i]=ans[i]+ans[i-1];
		    max=Math.max(ans[i],max);
		}
		System.out.println(max);
	}
}
