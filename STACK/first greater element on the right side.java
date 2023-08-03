import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[]={6,8,0,1,3};
		int n=arr.length;
		int ans[]=new int[n];
		ans[n-1]=-1;
		Stack<Integer>st=new Stack<>();
		st.push(arr[n-1]);
		for(int i=n-2;i>=0;i--){
		    while(!st.isEmpty() && arr[i]>=st.peek()){
		        st.pop();
		    }
		    ans[i]=st.isEmpty()?-1:st.peek();
		    st.push(arr[i]);
		}
		System.out.println(Arrays.toString(ans));
	}
}
