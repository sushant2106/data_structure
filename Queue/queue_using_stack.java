import java.util.*;

class Queue{
    Stack<Integer>st=new Stack<>();
    Stack<Integer>st2=new Stack<>();
    public boolean isEmpty(){
        return st.isEmpty();
    }
    public void offer(int data){
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        st.push(data);
        
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
    }
    public int poll(){
        if(isEmpty()){
            System.out.println("Its Empty()..");
            return -1;
        }
        return st.pop();
    }
   public int peek(){
       if(isEmpty()){
           return -1;
       }
       return st.peek();
   }
}
public class Main
{
	public static void main(String[] args) {
	   Queue qu=new Queue();
	   qu.offer(1);
	   qu.offer(2);
	   
	   while(!qu.isEmpty()){
	       System.out.println(qu.poll());
	   }
	}
}
