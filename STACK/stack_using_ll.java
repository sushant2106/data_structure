import java.util.*;

public class LinkedList
{     
    static  class Node{
        int data;
        Node next;
         Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static Node head;
    public static Node tail;
    
     void addFirst(int data){
         Node newNode=new Node(data);
         if(head==null){
             head=tail=newNode;
             return;
         }
         newNode.next=head;
         head=newNode;
     }
     public void show(){
         Node curr=head;
         while(curr!=null){
             System.out.print(curr.data+"->");
             curr=curr.next;
         }
         System.out.println();
     }
     void pop(){
         if(head==null){
             System.out.println("Stack is Empty()..");
             return;
         }
         head=head.next;
     }
     void peek(){
         if(head==null){
             System.out.println("Its Empty");
         }
         else{
             System.out.println(head.data);
         }
     }
	public static void main(String[] args) {
	  LinkedList ll=new LinkedList();
	  ll.addFirst(5);
	  ll.addFirst(4);
	  ll.addFirst(3);
	  ll.addFirst(2);
	  ll.addFirst(1);
	  ll.show();
	  ll.pop();
	  ll.show();
	  ll.peek();
	}
}
