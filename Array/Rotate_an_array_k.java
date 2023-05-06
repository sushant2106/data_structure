import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	int arr[]={5,4,1,3,2};
	int n=arr.length;
	int k=2;
	while(k-- >0){
	int tem=arr[n-1];
	int i;
    for(i=n-1;i>0;i--){
        arr[i]=arr[i-1];
    }
    arr[i]=tem;
	}
	
	System.out.print(Arrays.toString(arr));
		
		
	}
}
