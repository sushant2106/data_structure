import java.util.*;

class Stack{
    int arr[];
    int top1;
    int top2;
    int size;
    Stack(int size){
       this.size=size;
       arr=new int[size];
       top1=-1;
       top2=size;
    }
    
    void push1(int num){
        if(top2-top1>1){
            top1++;
            arr[top1]=num;
        }
        else{
            System.out.println("Stack is full  You can't add..");//Stack is overflow
        }
    }
    void push2(int num){
        if(top2-top1>1){
            top2--;
            arr[top2]=num;
        }
        else{
            System.out.println("Stack is full You can't add..");//Stack is overflow
        }
    }
    void pop1(){
        if(top1>=0){
            System.out.println("Stack pop:"+arr[top1]);
            top1--;
        }
        else{
            System.out.println("Its Empty..");//underflow
        }
    }
    void pop2(){
        if(top2<size){
            System.out.println("Stack pop:"+arr[top2]);
            top2++;
        }
        else{
            System.out.println("Its Empty..");//underflow
        }
    }
    void peek1(){
        if(top1>=0 && top1<size){
            System.out.println("Stack1 peek ele:"+arr[top1]);
        }
        else{
            System.out.println("Its Empty");
        }
    }
    void peek2(){
        if(top2<size){
            System.out.println("Stack2 peek2:"+arr[top2]);
        }
        else{
            System.out.println("Its Empty");
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	   Stack st=new Stack(5);
	   st.push1(1);
	   st.push2(2);
	   st.push1(3);
	   st.push2(4);
	   st.push1(5);
	   st.peek1();
	   st.peek2();
	}
}
