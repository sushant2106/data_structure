import java.util.*;

public class Main
{
	public static void main(String[] args) {
	  int arr[]={8,5,4,3,2};
	  int x=10;
	  int count=0;
	  Arrays.sort(arr);
	  for(int i=0;i<arr.length;i++){
	      if(arr[i]<=x){
	          count++;
	          x-=arr[i];
	      }
	  }
	  System.out.println(count);
	}
}
