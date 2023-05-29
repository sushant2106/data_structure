import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int nums[]={-1,0,1,2,-1,-4};
		int n=nums.length;
		HashSet<List<Integer>>set=new HashSet<>();
		Arrays.sort(nums);
		for(int i=0;i<n-2;i++){
		    for(int j=i+1;j<n-1;j++){
		        for(int k=j+1;k<n;k++){
		            List<Integer>list=new ArrayList<Integer>();
		            if(nums[i]+nums[j]+nums[k]==0){
		                list.add(nums[i]);
		                list.add(nums[j]);
		                list.add(nums[k]);
		                set.add(list);
		                
		            }
		        }
		    }
		}
		for(List x:set){
		    System.out.println(x);
		}
	}
}
