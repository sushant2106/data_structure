import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[]={17, 12, 10, 2, 7, 2, 11, 20};
		
		PriorityQueue<Integer>fr=new PriorityQueue<>((a,b)->(b-a));
		PriorityQueue<Integer>ba=new PriorityQueue<>((a,b)->(b-a));
		int i=0;
		int j=arr.length-1;
		int k=4;
		int size=3;
		int ans=0;
		while(i<j && size>0){
		    if(fr.size()!=k){
		        fr.offer(arr[i]);
		        i++;
		    }
		    if(ba.size()!=k){
		        ba.offer(arr[j]);
		        j--;
		    }
		    if(fr.size()==k && ba.size()==k){
		       if(fr.peek()>=ba.peek()){
		           ans+=fr.poll();
		       }
		       else{
		           ans+=ba.poll();
		       }
		       size--;
		    }
		}
		while(size>0){
		     if(fr.peek()>=ba.peek()){
		           ans+=fr.poll();
		       }
		       else{
		           ans+=ba.poll();
		       }
		       size--;
		}
		System.out.println(ans);
		
		
		
		
	}
}
