import java.util.*;

public class Main
{
	public static void main(String[] args) {
	  int arr[][]={{1,8},{4,9},{6,7}};
	  int prev=arr[0][1];
	  int curr=0;
	  int drop=0;
	  int rate=2,max=10;
	  int i=0;
	  for(i=1;i<arr.length;i++){
	      System.out.println(prev);
	      if(prev>max){
	          drop+=prev-max;
	          prev-=drop;
	      }
	      prev-=(arr[i][0]-arr[i-1][0])*rate;
	      curr=prev+arr[i][1];
	      prev=curr;
	  }
	  
	    if(prev>max){
	          drop+=prev-max;
	          prev-=drop;
	     }
	   System.out.println(drop);
	 
	  
	 
	}
}
