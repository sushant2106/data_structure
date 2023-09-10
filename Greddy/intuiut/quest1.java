import java.util.*;
//frequency count kr ke jiska sbse kam freq ha usko pehle fir dusre pe jayenge size toh fix hai wo i btayega ki kaha par ake ruke hai 
public class Main
{
	public static void main(String[] args) {
	   int arr[]={1,1,1,2,3,2};
	   int m=2;
	   List<Integer>freq=new ArrayList<>();
	   Arrays.sort(arr);
	   int count=1;
	   for(int i=0;i<arr.length-1;i++){
	       if(arr[i]==arr[i+1]){
	           count++;
	       }
	       else{
	           freq.add(count);
	           count=1;
	       }
	   }
	  freq.add(count);
	  Collections.sort(freq);
	  int i=0;
	  while(m-freq.get(i)>=0){
	      m-=freq.get(i);
	      i++;
	  }
	  int ele=freq.size()-i;
	  System.out.println(ele);
	}
}
