import java.util.*;


class Stack{
     int arr[];
     int top;
     int size;
     
     
     Stack(int size){
         this.size=size;
         arr=new int[size];
         top=-1;
     }
     
    void push(int num){
        //top<size
        if(top<=size-1){
            top++;
            arr[top]=num;
        }
        else{
           System.out.println("Stack is full");//overflow
        }
    }
    
    void pop(){
        if(top==-1){
            System.out.println("Stack is empty");//underflow
        }
        else{
            System.out.println("Deleted Element is "+arr[top]);
            top--;
        }
    }
    void peek(){
        if(top>=0 && top<size){
            System.out.println("Peek Element of Stack:"+arr[top]);
        }
        else{
            System.out.println("Stack is Empty");
        }
    }
    boolean isEmpty(){
        if(top==-1){
           return true;
        }
        else{
            return false;
        }
    }
    
}
public class Main
{
	public static void main(String[] args) {
	     Stack st=new Stack(5);
	     st.push(1);
	     st.push(2);
	     st.push(3);
	     st.push(4);
	     st.peek();
	     st.pop();
	}
}
