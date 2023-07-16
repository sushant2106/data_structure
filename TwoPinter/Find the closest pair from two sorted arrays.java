import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  	int arr1[] ={1, 4, 5, 7};
        int arr2[] ={10, 20, 30, 40};
        int k=50;
	  int l=0,h=arr2.length-1;
	  int n=arr2.length;
	  int ans[]=new int[2];
	  while(l<n && h>=0){
	      if(arr1[l]+arr2[h]<=k){
	          ans[0]=arr1[l];
	          ans[1]=arr2[h];
	          l++;
	      }
	      else{
	          h--;
	      }
	  }
	  System.out.println(Arrays.toString(ans));
	}
}
}
