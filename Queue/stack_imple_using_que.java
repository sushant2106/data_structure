import java.util.*;
class Stack{
    Queue<Integer>q1=new LinkedList<>();
    Queue<Integer>q2=new LinkedList<>();
    
    public boolean isEmpty(){
        return q1.isEmpty();
    }
    public void push(int data){
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(data);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }
    
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        return q1.poll();
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Its isEmpty");
            return -1;
        }
        return q1.peek();
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
	   Stack st=new Stack();
	   st.push(3);
	   st.push(2);
	   st.push(1);
	   while(!st.isEmpty()){
	       System.out.println(st.pop());
	   }
	   
	}
}
