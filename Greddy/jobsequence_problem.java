import java.util.*;
public class HelloWorld{
     static class Job{
         int deadline;
         int profit;
         int id;
         public Job(int i,int d,int p){
         this.deadline=d;
         this.profit=p;
         this.id=i;
     }
         
 }
    
     public static void main(String []args){
 int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
 ArrayList<Job>jobs=new ArrayList<>();
 for(int i=0;i<jobsInfo.length;i++){
     jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
 }
 Collections.sort(jobs,(a,b)->b.profit-a.profit);
ArrayList<Integer>seq=new ArrayList<>();

   int time=0;
   for(int i=0;i<jobs.size();i++){
       Job curr=jobs.get(i);
       if(curr.deadline>time){
           seq.add(curr.profit);
           time++;
       }
   }
   System.out.println(seq);
   
   
         
 }
    
}
