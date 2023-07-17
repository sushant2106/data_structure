import java.util.*;
//range based query
//TC 0(N*Q)
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
		  	int index=l;
		  	while(index<=r){
		  	    arr[index]+=1;
		  	    index++;
		  	}
		  	i++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
