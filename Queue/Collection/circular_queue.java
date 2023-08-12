import java.util.*;

class Queue{
    int arr[];
    int size;
    int rear;
    int front;
    Queue(int size){
        arr=new int[size];
        this.size=size;
        rear=-1;
        front=-1;
    }
     boolean isEmpty(){
      return rear==-1 && front==-1;
    }
    
    boolean isFull(){
        return (rear+1)%size == front;
    }
    
    void offer(int data){
        if(isFull()){
            System.out.println("Queue is Full...");
            return;
        }
        //When we are adding first Function
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
        
    }
    int poll(){
        if(isEmpty()){
            return -1;
        }
        int val=arr[front];
        if(rear==front){
            rear=front=-1;
        }
        else{
             front=(front+1)%size;
        }
        return val;
    }
 
    void peek(){
        if(isEmpty()){
            System.out.println("Its Empty()...");
            return;
        }
        System.out.println("Peek Element:"+arr[front]);
        
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
     
     while(!qu.isEmpty()){
         System.out.println(qu.poll());
         
     }
	}
}
