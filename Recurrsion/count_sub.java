import java.util.*;

public class Main
{   
    static int subseq(int index,int sum,int k,int arr[]){
        if(index==arr.length){
            if(sum==k){
                return 1;
            }
            return 0;
        }
        sum+=arr[index];
        int left=subseq(index+1,sum,k,arr);
        sum-=arr[index];
        int right=subseq(index+1,sum,k,arr);
        return left+right;
    
    }
	public static void main(String[] args) {
	    int arr[]={1,2,1};
		int k=3;
		int sum=0;
		//ArrayList<Integer>li=new ArrayList<>();
		System.out.println(subseq(0,sum,k,arr));
	 
	 
	 
	 
	}
}
