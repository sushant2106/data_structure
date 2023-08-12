import java.util.*;

class Queue{
    int arr[];
    int size;
    int rear;
    Queue(int size){
        arr=new int[size];
        this.size=size;
        rear=-1;
    }
    
    void offer(int data){
        if(rear==size-1){
            System.out.println("Queue is Full...");
            return;
        }
        rear=rear+1;
        arr[rear]=data;
    }
    boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        return false;
    }
    void poll(){
        if(isEmpty()){
            System.out.println("Its isEmpty bro");
            return;
        }
        int front=arr[0];
        System.out.println("Front of Queue:"+ front);
        for(int i=1;i<=rear;i++){
            arr[i-1]=arr[i];
        }
        rear--;
    }
    void peek(){
        if(isEmpty()){
            System.out.println("Its Empty()...");
            return;
        }
        System.out.println("Peek Element:"+arr[0]);
        
    }
}
public class Main
{
	public static void main(String[] args) {
     Queue qu=new Queue(5);
     qu.offer(1);
     qu.offer(2);
     qu.offer(3);
     qu.offer(4);
     qu.offer(5);
     
     qu.poll();
     qu.offer(6);
     qu.poll();
     qu.peek();
	}
}
