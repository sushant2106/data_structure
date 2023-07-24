import java.util.*;

public class Main
{   
   
	public static void main(String[] args) {
	   int arr[]={ 1, 4, 2, 10, 2, 3, 1, 0, 20 };
	   int n=arr.length;
	   int k=4;
	   int max=Integer.MIN_VALUE;
	   for(int i=0;i<=n-k;i++){
	       int temp=0;
	       for(int j=i;j<i+k;j++){
	          temp+=arr[j];
	       }
	       if(temp>max){
	           max=temp;
	       }
	   }
	     System.out.println(max);
	}
}
