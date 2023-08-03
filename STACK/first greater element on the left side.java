import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[]={1,3,2,4};
		int n=arr.length;
		int ans[]=new int[n];
	//	ans[0]=-1;
		Stack<Integer>st=new Stack<>();
	//	st.push(arr[0]);
		for(int i=0;i<n;i++){
		    while(!st.isEmpty() && arr[i]>st.peek()){
		        st.pop();
		    }
		    ans[i]=st.isEmpty()?-1:st.peek();
		    st.push(arr[i]);
		}
		System.out.println(Arrays.toString(ans));
	}
}
