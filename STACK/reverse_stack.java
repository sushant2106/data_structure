import java.util.*;

public class Main
{    
    static void bottom_add(Stack<Integer>st,int num){
        if(st.isEmpty()){
            st.push(num);
            return;
        }
        int temp=st.pop();
        bottom_add(st,num);
        st.push(temp);
    }
    
    static void revStack(Stack<Integer>st){
       if(st.isEmpty()){
           return;
       }
       int top=st.pop();
       revStack(st);
       bottom_add(st,top);
      
    }
	public static void main(String[] args) {
	   Stack<Integer>st=new Stack<>();
	   st.push(1);
	   st.push(2);
	   st.push(3);
	   st.push(4);
	   revStack(st);
	   
	   while(!st.isEmpty()){
	     System.out.println(st.pop());
	   }
	}
}
