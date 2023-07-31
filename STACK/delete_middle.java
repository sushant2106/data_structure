import java.util.*;

public class Main
{    
    static void solve(Stack<Integer>st,int count,int size){
        if(count==size/2){
            st.pop();
            return;
        }
        int temp=st.pop();
        solve(st,count+1,size);
        st.push(temp);
    }
    
	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
	  int count=0;
	  solve(st,count,5);
	  
	  while(!st.isEmpty()){
	      System.out.println(st.peek());;
	      st.pop();
	  }
		
	}
}
