import java.util.*;

public class Main
{
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        
       public Student(String name,int rank){
           this.name=name;
           this.rank=rank;
       }
       
   
       public int compareTo(Student s2){
           return this.rank-s2.rank;
       }
       
    }
	public static void main(String[] args) {
	  PriorityQueue<Student>pq=new PriorityQueue<>();
	  pq.offer(new Student("Ram",2));
	  pq.offer(new Student("Shyam",1));
	  pq.offer(new Student("Ghanshyam",0));
	 // System.out.println(pq);
	 
	 while(!pq.isEmpty()){
	     System.out.println(pq.peek().name+" "+pq.peek().rank);
	     pq.poll();
	 }
	 
	 
	 
	}
}
