import java.util.*;

public class Main
{   
    static void push_at_bottom(Stack<Integer>st,int num){
        if(st.size()==0){
            st.push(num);
            return;
        }
        int temp=st.pop();
        push_at_bottom(st,num);
        st.push(temp);
    }
	public static void main(String[] args) {
	   Stack<Integer>st=new Stack<>();
	   st.push(3);
	   st.push(2);
	   st.push(1);
	   push_at_bottom(st,4);
	   
	   while(!st.isEmpty()){
	       System.out.print(st.peek());
	       st.pop();
	   }
	   
	}
}
