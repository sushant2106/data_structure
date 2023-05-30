import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int nums[]={1,0,-1,0,-2,2}; 
		int target = 0;
		HashSet<List<Integer>>set=new HashSet<>();
	;
		int n=nums.length;
		for(int i=0;i<n-3;i++){
		    for(int j=i+1;j<n-2;j++){
		        for(int k=j+1;k<n-1;k++){
		            for(int l=k+1;k<n;k++){
		                if(nums[i]+nums[j]+nums[k]+nums[l]==target ){
		                    List<Integer>arr=new ArrayList<>();
		                     arr.add(nums[i]);
		                  arr.add(nums[j]);
		                    arr.add(nums[k]);
		                    arr.add(nums[l]);
		                    Collections.sort(arr);
		                    set.add(arr);
		                }
		            }
		        }
		    }
		}
		for(List x:set){
		    System.out.println(x);
		}
		
	}
