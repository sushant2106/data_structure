import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		
		//Stack Element is like That
		//3->2->1
		System.out.println("Remove top Element FROM stack="+st.pop());
		System.out.println("Top Element of stack="+st.peek());
		System.out.println("To check whether the stack is empty or not="+ st.isEmpty());
		
		st.clear();
		
		System.out.println(st.size());
	}
}
