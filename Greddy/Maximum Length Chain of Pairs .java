import java.util.*;

public class Main
{
	public static void main(String[] args) {
	int arr[][]={{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90} } ;
	Arrays.sort(arr,(a,b)->(a[0]-b[0]));
	int prev_end=arr[0][1];
	int prev_start=arr[0][0];

	int count=1;
	for(int i=1;i<arr.length;i++){
	 int  curr_start=arr[i][0];
	 int curr_end=arr[i][1];
	  if(curr_start>=prev_end){
	      count++;
	      prev_end=Math.max(curr_start,curr_end);
	  }
	}
   System.out.println(count);
	
	
	
	
	
	
	
	
	}
}
