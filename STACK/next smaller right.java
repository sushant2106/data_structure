import java.util.*;

public class Main
{
	public static void main(String[] args) {
	  int arr[]={4,5,2,10,8};
	  int n=arr.length;
	  int ans[]=new int[n];
	  Stack<Integer>st=new Stack<>();
	  for(int i=n-1;i>=0;i--)
	  {
	      while(!st.isEmpty() && arr[i]<st.peek()){
	          st.pop();
	      }
	      ans[i]=st.isEmpty()?-1:st.peek();
	      st.push(arr[i]);
	  }
	  System.out.println(Arrays.toString(ans));
	}
}
