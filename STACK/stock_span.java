import java.util.*;

public class Main
{   

	//price<=todays price aaj se kitne aise share thee jo isse pehle the ya equal tha
	public static void main(String[] args) { //check discription
	   int stock[]={100,80,60,70,60,85,100};
	   int n=stock.length;
	   int ans[]=new int[n];
	   Stack<Integer>st=new Stack<>();
	
	   for(int i=0;i<n;i++){
	      while(!st.isEmpty() && stock[st.peek()]<=stock[i]){
	          st.pop();
	      }
	      ans[i]=st.isEmpty()?i+1:i-st.peek();//i+1 matlab use bada ko element hi nahi hai 
	      st.push(i);
	      
	   }
	   System.out.println(Arrays.toString(ans));
	}
}
