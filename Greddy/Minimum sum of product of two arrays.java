import java.util.*;

public class Main
{
	public static void main(String[] args) {
	  int arr1[]={1,2,-3};
	  int arr2[]={-2, 3, -5};
	  int k=5;
	  int n=arr1.length;
	  int diff=0,temp=0,res=0;
	  
	  for(int i=0;i<n;i++){
	      int pro=arr1[i]*arr2[i];
	      res+=pro;
	      if(pro<0 && arr2[i]<0){
	          temp=(arr1[i]+2*k)*arr2[i];
	      }
	      else if(pro<0 && arr1[i]<0){
	          temp=(arr1[i]-2*k)*arr2[i];
	      }
	      else if(pro>0 && arr1[i]>=0){
	          temp=(arr1[i]-2*k)*arr2[i];
	      }
	      else if(pro>0 && arr1[i]<0){
	          temp=(arr1[i]+2*k)*arr2[i];
	      }
	      int d=Math.abs(pro-temp);
	      if(d>diff){
	          diff=d;
	      }
	      
	  }
	  System.out.println(res-diff);
	  
	}
}
