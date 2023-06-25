import java.util.*;

public class Main
{
    static boolean possible(int pages[],int mid,int m){
        int allocate=1,curr_page=0;
      for(int i=0;i<pages.length;i++){
          if(pages[i]>mid)return false;
          if(curr_page+pages[i]>mid){
              allocate++;
              curr_page=pages[i];
          }
          else{
               curr_page+=pages[i];
          }
      }
      return allocate==m;
    }
	public static void main(String[] args) {
		int pages[] = {12, 34, 67, 90}, m=2;
		int min=Integer.MAX_VALUE;
		int sum=0;
		for(int i=0;i<pages.length;i++){
		    sum+=pages[i];
		    min=Math.min(pages[i],min);
		}
		int l=min;
		int h=sum;
		int ans=-1;
		while(l<=h){
		    int mid=l+h>>1;
		    if(possible(pages,mid,m)){
		        ans=mid;
		        h=mid-1;
		    }
		    else{
		        l=mid+1;
		    }
		}
		System.out.println(ans);
	}
}
