import java.util.*;

public class Main
{
    static int k=2;
    static boolean subseq_sum(int index,int sum,int arr[],	ArrayList<Integer>list){
        if(index==arr.length){
            if(sum==k)
             {
                  System.out.println(list);
            return true;
             }
             return false;
        }
        list.add(arr[index]);
        sum+=arr[index];
        if(subseq_sum(index+1,sum,arr,list)==true){
            return true;
        }
        list.remove(list.size()-1);
        sum-=arr[index];
        if(subseq_sum(index+1,sum,arr,list)==true){
            return true;
        }
        return false;
        
    }
	public static void main(String[] args) {
		int arr[]={1,2,1};
		ArrayList<Integer>list=new ArrayList<>();
		subseq_sum(0,0,arr,list);
	}
}
