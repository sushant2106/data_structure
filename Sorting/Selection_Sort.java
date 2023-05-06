import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	int arr[]={1,5,4,3,2};
	int n=arr.length;
	for(int i=0;i<n;i++){
	    int min=arr[i];
	    int index=i;
    for(int j=i+1;j<n;j++)
     {
          if(min>arr[j]){
          min=arr[j];
          index=j;
      }
      int tem=arr[i];
      arr[i]=min;
      arr[index]=tem;
     }
      
	}
	
	System.out.print(Arrays.toString(arr));
		
		
	}
}
