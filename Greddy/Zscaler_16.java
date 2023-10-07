import java.util.*;
public class HelloWorld{
      static int count_setBit(int n){
		   int count=0;
		   while(n>0){
		       n=n&(n-1);
		       count++;
		   }
		  return count;
      }
     public static void main(String []args){
        //  int arr[][]={{30,40},{1,10},{11,15}};
        int arr[][]={{1,2},{9,10}};
	   Arrays.sort(arr,(a,b)->a[0]-b[0]);
	    int n=10;
	    int ans=0;
	    int prev_end=arr[0][1];
	    if(arr[0][0]>0){
	        int len=Math.abs(arr[0][0]-1);
	        ans+=count_setBit(len);
	    }
	    for(int i=1;i<arr.length;i++){
	        int start=arr[i][0];
	        if(start>=prev_end){
	            int len=Math.abs(start-prev_end)-1;
	
	            ans+=count_setBit(len);
	        }
	        prev_end=arr[i][1];
	    }
	    if(n>prev_end){
	        int len=Math.abs(n-prev_end);
	         System.out.println(len);
	         ans+=count_setBit(len);
	          
	    }
	 System.out.println(ans);


     }
}
