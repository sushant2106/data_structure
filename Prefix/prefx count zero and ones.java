import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[]={1,0,1,0,1};
		int n=arr.length;
		int zero[]=new int[n];
		int one[]=new int[n];
		if(arr[0]==0){
		    zero[0]=1;
		}
		else{
		    one[0]=1;
		}
		for(int i=1;i<n;i++){
		    if(arr[i]==0){
		        zero[i]=zero[i-1]+1;
		        one[i]=one[i-1];
		    }
		    else{
		        zero[i]=zero[i-1];
		        one[i]=one[i-1]+1;
		    }
		}
		System.out.println(Arrays.toString(zero));
		System.out.println(Arrays.toString(one));
	}
}
