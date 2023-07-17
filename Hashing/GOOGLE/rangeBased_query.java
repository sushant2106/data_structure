import java.util.*;
//range based query
//TC 0(N)+O(Q)
public class Main
{
	public static void main(String[] args) {
		int n=5;
		int arr[]=new int[n+1];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Queries...");;
		int q=sc.nextInt();
		int i=1;
		while(i<=q){
		  	System.out.println("ENter l...");
		  	int l=Integer.parseInt(sc.next());
		  	System.out.println("Enter R...");
		  	int r=Integer.parseInt(sc.next());
		  	arr[l]+=1;
		  	if(r!=n){
		  	    arr[r+1]+=-1;
		  	}
		  	i++;
		}
		for(int j=1;j<=n;j++){
		    arr[j]=arr[j]+arr[j-1];
		}
		System.out.println(Arrays.toString(arr));
	}
}
