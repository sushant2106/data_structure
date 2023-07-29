import java.util.*;

public class LinkedList
{
    
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }
   static Node head;
   static Node tail;
  static void addLast(int data){
      Node newNode=new Node(data);
      if(head==null){
          head=tail=newNode;
          return;
      }
      tail.next=newNode;
      tail=newNode;
  }
   static void show(){
     Node curr=head;
     while(curr!=null){
         System.out.print(curr.data+" ");
         curr=curr.next;
     }
     System.out.println();
   }
   static Node getMid(Node head){
       Node slow=head;
       Node fast=head.next;
       
       while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       return slow;
   }
   static Node merge(Node leftH,Node rightH){
       Node dummy=new Node(-1);
       Node temp=dummy;
       
       while(leftH!=null && rightH!=null){
           if(leftH.data>=rightH.data){
               temp.next=rightH;
               temp=temp.next;
               rightH=rightH.next;
           }
           else{
               temp.next=leftH;
               temp=temp.next;
               leftH=leftH.next;
           }
       }
       while(leftH!=null){
           temp.next=leftH;
               temp=temp.next;
               leftH=leftH.next;
       }
       while(rightH!=null){
            temp.next=rightH;
             temp=temp.next;
              rightH=rightH.next;
       }
       return dummy.next;
   }
   public Node mergeSort(Node head){
       if(head==null || head.next==null){
           return head;
       }
        Node mid=getMid(head);
	  
	   Node rightHead=mid.next;
	   mid.next=null;//breaking the two half 
	   
	   Node newleft=mergeSort(head);
	   Node newRight=mergeSort(rightHead);
	   return merge(newleft,newRight);
   }
	public static void main(String[] args) {
	   LinkedList ll=new LinkedList();
	   ll.addLast(7);
	   ll.addLast(1);
	   ll.addLast(2);
	   ll.addLast(9);
	   ll.addLast(5);
	   
	   show(); 
	   ll.head=ll.mergeSort(head);
	   show();
	   
	}
}
