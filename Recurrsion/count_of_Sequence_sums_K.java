import java.util.*;

public class Main
{
    static int k=2;
    static int count=0;
    static void subseq_sum(int index,int sum,int arr[]){
        if(index==arr.length){
            if(sum==k)
            count++;
            return;
        }
        sum+=arr[index];
        subseq_sum(index+1,sum,arr);
        sum-=arr[index];
        subseq_sum(index+1,sum,arr);
        
    }
	public static void main(String[] args) {
		int arr[]={1,2,1};
		subseq_sum(0,0,arr);
		System.out.println(count);
	}
}
