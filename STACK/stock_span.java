import java.util.*;

public class Main
{
	public static void main(String[] args) {
	   int stock[]={ 10,4,5,90,120,80};
	   int n=stock.length;
	   int ans[]=new int[n];
	   Stack<Integer>st=new Stack<>();
	   st.push(0);
	   ans[0]=1;
	   for(int i=1;i<n;i++){
	      while(!st.isEmpty() && stock[st.peek()]<stock[i]){
	          st.pop();
	      }
	      ans[i]=st.isEmpty()?i+1:i-st.peek();//i+1 matlab use bada ko element hi nahi hai 
	      st.push(i);
	      
	   }
	   System.out.println(Arrays.toString(ans));
	}
}
